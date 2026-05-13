package edu.teamrocket.stockx.criteria;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;
import edu.teamrocket.stockx.offer.Bid;

public class MaxBid implements Criteria {

    public MaxBid() {};

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> bidsMax = item.offers()
                                    .stream()
                                    .filter(a -> a instanceof Bid)
                                    .max(Offer::compareTo);
        return bidsMax.isPresent() ? List.of(bidsMax.get()) : List.of();
    }
}
