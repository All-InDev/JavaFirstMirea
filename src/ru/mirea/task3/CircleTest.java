package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setFilled(true);
        circle.setRadius(5.2f);
        System.out.println(circle.getRadius());
        System.out.println(circle.isFilled());
    }
}
