package ru.mirea.lab12;

import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-\\w.]+@([A-z0-9][-A-z0-9]+(\\.|))+[A-z]{2,4}$");
        String[] tests = {
                "user@gmail.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String",
                "student.m.a@edu.mirea.ru"
        };
        for (String test : tests)
            System.out.println(pattern.matcher(test).matches() + "\t:" + test);
    }
}
