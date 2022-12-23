package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Alice in Wonderland", "Lewis Carroll");
        System.out.println(book);
        book.setSize(40, 60);
        System.out.println(book.getHeight());
        book.open();
        System.out.println(book);
    }
}