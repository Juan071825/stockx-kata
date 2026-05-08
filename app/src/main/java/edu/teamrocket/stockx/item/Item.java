package edu.teamrocket.stockx.item;

import edu.teamrocket.stockx.offer.Offer;
import java.util.List;

public interface Item {
    int getBid();
    int getAsk();
    int getSale();
    void add(Offer offer);
    List<Offer> offers();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
}