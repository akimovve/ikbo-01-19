package ru.mirea.lab2.task_3;

import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int creationYear;
    private int pages;

    public Book(String title, String author, int creationYear, int pages) {
        checkInputData(creationYear, pages);
        this.title = title;
        this.author = author;
        this.creationYear = creationYear;
        this.pages = pages;
    }

    private void checkInputData(int... values) {
        Arrays.stream(values).forEach(el -> {
            if (el <= 0) {
                throw new IllegalStateException("Incorrect input data: " + Arrays.toString(values));
            }
        });
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        checkInputData(creationYear);
        this.creationYear = creationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        checkInputData(pages);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", creationYear=" + creationYear +
                ", pages=" + pages +
                '}';
    }
}
