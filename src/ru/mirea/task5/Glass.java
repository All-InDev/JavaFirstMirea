package ru.mirea.task5;

public class Glass extends Dish {
    public Glass() {
        volume = 0;
        color = "transparent";
        material = "glass";
    }

    @Override
    public void fill() {
        volume = 200;
    }
}
