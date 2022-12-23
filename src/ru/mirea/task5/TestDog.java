package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Dog corgi = new Corgi();
        System.out.println(corgi.getHeight());

        Dog lab = new Labrador();
        System.out.println(lab.getCharacter());
    }
}
