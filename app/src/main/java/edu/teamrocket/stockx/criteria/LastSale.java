package edu.teamrocket.stockx.criteria;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Sale;
import edu.teamrocket.stockx.offer.Offer;

public class LastSale implements Criteria {

    public LastSale() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = item.offers().stream()
                                    .filter(a -> a instanceof Sale)
                                    .collect(Collectors.toList());

        List<Offer> lastSale = Arrays.asList(salesList.get(-1));

        return lastSale;
    }
}