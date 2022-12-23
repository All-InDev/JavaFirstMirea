package ru.mirea.task3;

public class Hand {
    private String side;
    private double length;

    public Hand(String side) {
        this.side = side;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "{" +
                "side ='" + side + '\'' +
                ", length =" + length +
                '}';
    }
}
