package ru.kostyanich;

/**
 * Created by liveuser on 01.11.18.
 */
public class Table implements Priceable{
    int price;

    public Table(int price) {
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
