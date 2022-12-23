package ru.mirea.task6;

public class TestNameable {
    public static void main(String[] args) {
        Nameable planet = new Planet("Jupiter");
        System.out.println(planet.getName());

        Nameable city = new City("New York");
        System.out.println(city.getName());
    }

}
