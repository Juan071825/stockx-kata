package edu.teamrocket.stockx.offer;

public class Ask implements Offer {
    private final String size;
    private final int ask;

    Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.value() - offer.value();
    }

    @Override
    public String toString() {
        return """
                Size: \s
                Value: \n
                """.formatted(this.size(), this.value());
    }
}