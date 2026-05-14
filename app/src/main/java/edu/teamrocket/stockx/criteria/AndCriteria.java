package edu.teamrocket.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;

public class AndCriteria implements Criteria {
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria (Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(item);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(item);

        List<Offer> items = firstCriteriaItems.stream()
                                            .filter(a -> otherCriteriaItems.contains(a))
                                            .collect(Collectors.toList());
        return items;
    }
}
    
