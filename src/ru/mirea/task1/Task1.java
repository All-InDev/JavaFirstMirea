package ru.mirea.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, x = 0;
        int[] mas = new int[5];
        int[] A = {32, 4, 1, -34, 12, 66, 12};
        for (int i=0; i < A.length; i++)
        {
            sum += A[i];
        }
        System.out.println("Сумма элементов: ");
        System.out.println(sum);
        System.out.println("Среднее арифметическое: ");
        System.out.println(sum / A.length);

        sum = 0;
//        System.out.println("Введите 5 элементов массива:");
//        for (int i=0; i < mas.length; i++)
//        {
//            mas[i] = sc.nextInt();
//        }
//
//        while (x < mas.length)
//            sum += mas[x++];
//        System.out.println("Сумма элементов (по while): ");
//        System.out.println(sum);
//        sum = 0;
//        x = 0;
//        do {
//            sum += mas[x];
//            x++;
//        } while (x < mas.length);
//        System.out.println("Сумма элементов (по do while): ");
//        System.out.println(sum);
//        int max = mas[0];
//        for (int ktr = 0; ktr < mas.length; ktr++) {
//            if (mas[ktr] > max) {
//                max = mas[ktr];
//            }
//        }
//        int min = mas[0];
//        for (int ktr = 0; ktr < mas.length; ktr++) {
//            if (mas[ktr] < min) {
//                min = mas[ktr];
//            }
//        }
//        System.out.println("Макисмальный элемент массива: " + max);
//        System.out.println("Минимальный элемент массива: " + min);

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        System.out.println("Гармонический ряд: ");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%.2f", 1./i);
            System.out.println();

        }
    }
}

