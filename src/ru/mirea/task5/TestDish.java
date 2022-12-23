package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        Dish glass = new Glass();
        System.out.println(glass);
        glass.fill();
        System.out.println(glass.getVolume());

        Pan pan = new Pan();
        pan.setColor("white");
        System.out.println(pan);
    }
}
