package edu.teamrocket.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;


public class Size implements Criteria {

    private String size;
    public Size(String size) {
        this.size = size;
    };

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sizeOffers = item.offers()
                                        .stream()
                                        .filter(a -> a.size().equals(this.size))
                                        .collect(Collectors.toList());
        return sizeOffers;
    }
    
}