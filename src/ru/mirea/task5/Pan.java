package ru.mirea.task5;

public class Pan extends Dish {
    public Pan() {
        volume = 0;
        color = "black";
        material = "steel";
    }

    @Override
    public void fill() {
        volume = 1000;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
