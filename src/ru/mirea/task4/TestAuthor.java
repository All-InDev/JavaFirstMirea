package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Sergey", "i@m.ru", 'm');

        System.out.println(author.getEmail());
        System.out.println(author.getName());
        author.setEmail("a@p.ru");
        System.out.println(author.getEmail());
        System.out.println(author);

    }
}
