package ru.mirea.task3;

public class Head {
    private double size;
    private String eyeColor;

    public Head() {}

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setEyesColor(String color) {
        this.eyeColor = color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + size +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
