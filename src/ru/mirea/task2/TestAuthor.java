package ru.mirea.task2;
import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String e;
        Author Pushkin = new Author("Alexander", "litfather@mail.ru", 'm');
        System.out.println("Имя автора: " + Pushkin.getName());
        System.out.println("Email автора: " + Pushkin.getEmail());
        System.out.println("Пол автора: " + Pushkin.getGender());

        Scanner source = new Scanner(System.in);
        System.out.println("Введите новый Email:");
        e = source.nextLine();
        Pushkin.setEmail(e);

        System.out.println("\nНовый Email автора: " + Pushkin.getEmail());

    }

}
