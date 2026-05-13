package edu.teamrocket.stockx.criteria;

import java.util.List;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.*;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min (Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> askMinSize = item.offers()
                                        .stream()
                                        .filter(a -> a instanceof Ask)
                                        .min(Offer::size)
    }
}