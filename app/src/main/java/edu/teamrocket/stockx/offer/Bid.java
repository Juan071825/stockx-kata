package edu.teamrocket.stockx.offer;

public class Bid implements Offer {
    private final String size;
    private final Integer bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return """
                Size: %s
                Value: %d
                """.formatted(this.size(), this.value());
    }
}