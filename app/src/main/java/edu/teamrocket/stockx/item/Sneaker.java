package edu.teamrocket.stockx.item;

import java.util.List;
import edu.teamrocket.stockx.offer.Offer;

public class Sneaker implements Item {

    private String style, name;
    private int sale, ask, bid;
    private List<Offer> listaOfertas;


    public Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getBid(){
        return this.bid;
    }

    @Override
    public int getAsk(){
        return this.ask;
    }

    @Override
    public int getSale(){
        return this.sale;
    }

    @Override
    public void add(Offer offer){
        listaOfertas.add(offer);
    }

    @Override
    public List<Offer> offers(){
        return listaOfertas;
    }

    @Override
    public void setBid(int bid){
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask){
        this.ask = ask;
    }

    @Override
    public void setSale(int sale){
        this.sale = sale;
    }

    public String toString(){
        StringBuilder sneaker = new StringBuilder();
        sneaker.append("getName()/n");
        sneaker.append("getStyle()/n");
        return sneaker.toString();
    }

}