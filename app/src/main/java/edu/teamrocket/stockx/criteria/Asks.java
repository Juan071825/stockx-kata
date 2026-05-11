package edu.teamrocket.stockx.criteria;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;
import edu.teamrocket.stockx.offer.Ask;

public class Asks implements Criteria {

    public Asks() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> asksList = item.offers().stream()
                                    .filter(a -> a instanceof Ask)
                                    .collect(Collectors.toList());
        return asksList;
    }
}
