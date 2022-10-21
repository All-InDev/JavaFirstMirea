package ru.mirea.task2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);

    }
}
