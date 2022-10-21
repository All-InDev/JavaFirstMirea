package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class PitomnikSobak {
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
        int n = 1, age;
        String name;
        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество собак:");
        n = source.nextInt();
        Dog[] Doge = new Dog[n];

        for (int i = 0; i < n; i++) {
            Scanner dog = new Scanner(System.in);
            System.out.println("Введите имя собаки #" + (i+1));
            name = dog.nextLine();
            System.out.println("Введите возраст собаки #" + (i+1));
            age = dog.nextInt();
            Doge[i] = new Dog(name, age);
        }

        System.out.println("Сколько собак добавить?:");
        n = source.nextInt();
        Dog[] moreDoge = addDogs(Doge, n);
        Doge = moreDoge;
    }
}
