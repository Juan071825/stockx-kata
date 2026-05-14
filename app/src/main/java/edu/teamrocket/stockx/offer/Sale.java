package edu.teamrocket.stockx.offer;

public class Sale implements Offer {
    private final String size;
    private final Integer sale;

    public Sale(String size, int sale) {
        this.size = size;
        this.sale = sale;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.sale;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.sale.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return """
                Size: %s
                Value: %d
                """.formatted(this.size(), this.value());
    }
}