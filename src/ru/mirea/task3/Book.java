package ru.mirea.task3;

public class Book {
    private double width;
    private double height;
    private int pageNumber;
    private String name;
    private String author;
    private boolean isOpen;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        width = 30.0;
        height = 45.0;
        pageNumber = 50;
        isOpen = false;
    }

    public Book(String name, String author, double width, double height, boolean isOpen) {
        this.name = name;
        this.author = author;
        this.width = width;
        this.height = height;
        this.isOpen = isOpen;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setSize(double width, double height)
    {
        width = width;
        height = height;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "width=" + width +
                ", height=" + height +
                ", pageNumber=" + pageNumber +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
