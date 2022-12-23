package ru.mirea.task5;

public abstract class Dish {
    protected double volume;
    protected String color;
    protected String material;

    public double getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public abstract void fill();

    @Override
    public String toString() {
        return "Dish{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
