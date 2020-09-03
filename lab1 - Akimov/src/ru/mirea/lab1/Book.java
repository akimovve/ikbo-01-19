package ru.mirea.lab1;

public class Book {
    private final String title;
    private final String author;
    private final long numOfPages;

    public Book(String title, String author, long numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
