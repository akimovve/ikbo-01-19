package ru.mirea.lab2.task_3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("The Murder of Roger Ackroyd", "Agatha Christie", 2020, 264);
        System.out.println(book);
        book.setPages(312);
        book.setCreationYear(1926);
        System.out.println(book);
    }
}
