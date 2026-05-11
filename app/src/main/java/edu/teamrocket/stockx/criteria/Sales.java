package edu.teamrocket.stockx.criteria;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;

class Sales implements Criteria {

    Sales(Item item) {
        checkCriteria(item);
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = item.offers().stream()
                                    .filter(a -> a instanceof Sale)
                                    .collect(Collectors.toList());
    }
}