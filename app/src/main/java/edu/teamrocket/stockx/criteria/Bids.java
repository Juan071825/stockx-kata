package edu.teamrocket.stockx.criteria;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;
import edu.teamrocket.stockx.offer.Bid;

class Bids implements Criteria {

    Bids(Item item) {
        checkCriteria(item);
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsList = item.offers().stream()
                                    .filter(a -> a instanceof Bid)
                                    .collect(Collectors.toList());
        return bidsList;
    }
}
