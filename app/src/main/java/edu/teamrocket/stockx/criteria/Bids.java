package edu.teamrocket.stockx.criteria;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;

class Bids implements Criteria {

    void Bids(Item item) {
        checkCriteria(item);
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsList = item.offers().stream()
                                    .filter(a -> a instanceof Bid)
                                    .collect(Collectors.toList());
    }
}
