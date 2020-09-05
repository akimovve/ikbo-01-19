package ru.mirea.pr2.task_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Stephen Edwin King", "sk_47@hotmail.com", 'M');
        System.out.println(author);
        author.setEmail("stephen_king@gmail.com");
        System.out.println(author);
    }
}
