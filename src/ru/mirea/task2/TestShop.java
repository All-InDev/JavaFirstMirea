package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        int n = 1, menu;
        String comp;
        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество компьютеров:");
        n = source.nextInt();

        Shop DNS = new Shop(n);

        for (int i = 0; i < n; i++) {
            Scanner mag = new Scanner(System.in);
            System.out.println("Введите название компьютера " + (i+1));
            comp = mag.nextLine();
            DNS.fillTable(i, comp);
        }
        System.out.println(DNS.toString());

        System.out.println("Что сделать с массивом?\n1. Добавить элемент\n2. Удалить элемент\n3. Найти элемент");
        menu = source.nextInt();

        switch (menu)
        {
            case 1:
                Scanner adder = new Scanner(System.in);
                System.out.println("Введите название компьютера");
                comp = adder.nextLine();
                DNS.addComp(comp);
                System.out.println("Элемент добавлен");

                break;
            case 2:
                DNS.removeComp();
                System.out.println("Элемент удален");
                break;
            case 3:
                Scanner search = new Scanner(System.in);
                System.out.println("Введите название компьютера");
                comp = search.nextLine();
                int i = DNS.findComp(comp);
                if (i > -1)
                    System.out.println("Компьютер найден: позиция " + i);
                else
                    System.out.println("Компьютер не найден!");

                break;

        }
        System.out.println(DNS.toString());

    }
}
