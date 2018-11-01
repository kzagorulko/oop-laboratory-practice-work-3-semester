package ru.kostyanich;

/**
 * Created by liveuser on 01.11.18.
 */
public class Bottle implements Priceable{
    int price;

    public Bottle(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
