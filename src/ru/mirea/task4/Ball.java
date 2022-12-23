package ru.mirea.task4;

public class Ball {
    private double x;
    private double y;

    public Ball() {
        x = 0.0;
        y = 0.0;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDist, double yDist) {
        x += xDist;
        y += yDist;
    }

    @Override
    public String toString()
    {
        return ("Ball x and y: " + x + ' ' + y);
    }
}
