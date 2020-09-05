package ru.mirea.pr1;

public class Book {
    private String title;
    private String author;
    private long numOfPages;

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

    public long getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(long numOfPages) {
        this.numOfPages = numOfPages;
    }
}
