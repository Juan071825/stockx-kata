package edu.teamrocket.stockx.criteria;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.*;
import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria {

    public MinAsk() {};

    @Override
    public List<Offer> checkCriteria (Item item) {
        Optional<Offer> askMin = item.offers()
                                    .stream()
                                    .filter(a -> a instanceof Ask)
                                    .min(Offer::compareTo);
        return askMin.isPresent() ? List.of(askMin.get()) : List.of();
    }
}