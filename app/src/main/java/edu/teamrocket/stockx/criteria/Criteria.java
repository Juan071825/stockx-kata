package edu.teamrocket.stockx.criteria;
import edu.teamrocket.stockx.item.Item;
import edu.teamrocket.stockx.offer.Offer;
import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}