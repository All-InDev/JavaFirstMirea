package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;

public class Testers {
    public static Dog[] addDogs(Dog[] dogs, int n) {
        int age;
        String name;
        Dog[] moredogs = new Dog[dogs.length + n];
        for (int i = 0; i < dogs.length; i++)
            moredogs[i] = dogs[i];

        for (int i = dogs.length; i < n; i++) {
            Scanner dog = new Scanner(System.in);
            System.out.println("Введите имя новой собаки #" + (i+1));
            name = dog.nextLine();
            System.out.println("Введите возраст новой собаки #" + (i+1));
            age = dog.nextInt();
            moredogs[i] = new Dog(name, age);
        }
        return moredogs;
    }
    public static void main(String[] args) {
        int main_menu;
        Scanner source = new Scanner(System.in);

        System.out.println("Какой класс?\n1. Автор\n2. Мяч\n3. Круги\n4. Магазин\n5. Собаки: ");
        main_menu = source.nextInt();

        while (main_menu != 0) {
            switch (main_menu) {
                case 1:
                    //Author
                    Scanner input = new Scanner(System.in);
                    String e;
                    Author Pushkin = new Author("Alexander", "litfather@mail.ru", 'm');
                    System.out.println("Имя автора: " + Pushkin.getName());
                    System.out.println("Email автора: " + Pushkin.getEmail());
                    System.out.println("Пол автора: " + Pushkin.getGender());

                    System.out.println("Введите новый Email:");
                    e = input.nextLine();
                    Pushkin.setEmail(e);

                    System.out.println("\nНовый Email автора: " + Pushkin.getEmail());
                    break;


                case 2:
                    //Ball
                    double x, y;
                    Ball Myach = new Ball(2.0, -4);
                    System.out.println("Координаты мяча: x = " + Myach.getX() + ", y = " + Myach.getY());

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
                    break;

                case 3:
                    //Circle - ???
                    int n = 1;
                    System.out.println("Введите количество кругов:");
                    n = source.nextInt();

                    Circle[] circles = new Circle[n];
                    break;

                case 4:
                    //Shop
                    int menu;
                    n = 1;
                    String comp;
                    System.out.println("Введите количество компьютеров:");
                    n = source.nextInt();

                    Shop DNS = new Shop(n);

                    for (int i = 0; i < n; i++) {
                        Scanner mag = new Scanner(System.in);
                        System.out.println("Введите название компьютера " + (i + 1));
                        comp = mag.nextLine();
                        DNS.fillTable(i, comp);
                    }
                    System.out.println(DNS.toString());

                    System.out.println("Что сделать с массивом?\n1. Добавить элемент\n2. Удалить элемент\n3. Найти элемент");
                    menu = source.nextInt();

                    switch (menu) {
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
                    break;
                case 5:
                    //Dogs
                    n = 1;
                    int age;
                    String name;
                    System.out.println("Введите количество собак:");
                    n = source.nextInt();
                    Dog[] Doge = new Dog[n];

                    for (int i = 0; i < n; i++) {
                        Scanner dog = new Scanner(System.in);
                        System.out.println("Введите имя собаки #" + (i + 1));
                        name = dog.nextLine();
                        System.out.println("Введите возраст собаки #" + (i + 1));
                        age = dog.nextInt();
                        Doge[i] = new Dog(name, age);
                    }

                    System.out.println("Сколько собак добавить?:");
                    n = source.nextInt();
                    Dog[] moreDoge = addDogs(Doge, n);
                    Doge = moreDoge;
                    break;
            }
            System.out.println("Какой класс?\n1. Автор\n2. Мяч\n3. Круги\n4. Магазин\n5. Собаки: ");
            main_menu = source.nextInt();
        }

    }

}
