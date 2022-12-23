package ru.mirea.task6;

public class Cake implements Priceable {
    private int price;

    public Cake(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
