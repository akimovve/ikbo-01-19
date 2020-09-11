package ru.mirea.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class FilesTest {
    final private static Logger log = Logger.getLogger(FilesTest.class.getName());
    final private static String FILEPATH = "test_file.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("1) Запись информации в файл с клавиатуры...");
        writeFile(scanner, false);

        // Задание 2
        System.out.println("\n2) Чтение информации из файла...");
        readFile();

        // Задание 3
        System.out.println("\n3) Замена информации в файле...");
        writeFile(scanner, false);
        readFile();

        // Задание 4
        System.out.println("\n4) Добавление информации в конец файла...");
        writeFile(scanner, true);
        System.out.println();
        readFile();
    }

    private static void writeFile(Scanner scanner, boolean append) {
        try (FileWriter writer = new FileWriter(FILEPATH, append)) {
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();
            writer.write(text);
            writer.flush();
            System.out.println("Информация была успешно записана в файл.");
        } catch (IOException e) {
            log.warning("Ошибка при записи информации в файл. " + e.getMessage());
        }
    }

    private static void readFile() {
        try (FileReader reader = new FileReader(FILEPATH)) {
            int symbol;
            System.out.println("Информация из файла: ");
            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }
            System.out.println();
        } catch (IOException e) {
            log.warning("Ошибка при чтении информации из файла. " + e.getMessage());
        }
    }
}
