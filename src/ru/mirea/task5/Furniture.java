package ru.mirea.task5;

public abstract class Furniture {
    protected String color;
    protected String material;
    private int price;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String getMaterial() {
        return material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
