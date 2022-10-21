package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x,y;
        Ball Myach = new Ball(2.0, -4);
        System.out.println("Координаты мяча: x = " + Myach.getX() + ", y = " + Myach.getY());

        Scanner source = new Scanner(System.in);
        System.out.println("Введите новые координаты:");
        x = source.nextDouble();
        y = source.nextDouble();

        Myach.setXY(x, y);
        System.out.println("Новые координаты мяча: x = " + Myach.getX() + ", y = " + Myach.getY());

        System.out.println("Введите координаты передвижения мяча:");
        x = source.nextDouble();
        y = source.nextDouble();
        Myach.move(x, y);
        System.out.println("Новые координаты мяча: x = " + Myach.getX() + ", y = " + Myach.getY());

    }

}
