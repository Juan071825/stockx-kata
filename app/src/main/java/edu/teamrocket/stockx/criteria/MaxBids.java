package edu.teamrocket.stockx.criteria;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;
import edu.teamrocket.stockx.offer.Bid;

public class MaxBids implements Criteria {

    public MaxBids() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsList = item.offers()
                                    .stream()
                                    .filter(a -> a instanceof Bid)
                                    .collect(Collectors.toList());

        List<Offer> orderedBidsList = bidsList.stream()
                                                .sorted()
                                                .collect(Collectors.toList());
        return orderedBidsList;
    }
}
