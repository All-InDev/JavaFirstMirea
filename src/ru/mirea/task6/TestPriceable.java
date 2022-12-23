package ru.mirea.task6;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable car = new Car(900);
        System.out.println(car.getPrice());

        Priceable cake = new Cake(0);
        System.out.println(cake.getPrice());
    }
}
