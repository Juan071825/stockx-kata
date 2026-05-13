package edu.teamrocket.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.*;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max (Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = new AndCriteria(criteria, otherCriteria).checkCriteria(item);

        Optional<Offer> askMaxSize = offers.stream()
                                        .max(Offer::compareTo);
        
        return askMaxSize.isPresent() ? List.of(askMaxSize.get()) : List.of();
    }
}