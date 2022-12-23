package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.5, 3.0);

        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setX(4.0);
        System.out.println(ball.getX());
        ball.move(1.0, 1.0);
        System.out.println(ball);
    }
}
