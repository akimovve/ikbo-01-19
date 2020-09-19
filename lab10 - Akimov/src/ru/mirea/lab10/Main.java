package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task1();
        System.out.println();
        main.task2And3();
    }

    // Задание 1
    private <T> List<T> convertToList(T[] source) {
        return new ArrayList<>(Arrays.asList(source));
    }

    // Задание 2
    class GenericsDataKeeper<T> {
        final private T[] data;
        private int currentSize;

        @SuppressWarnings("unchecked")
        public GenericsDataKeeper(int size) {
            if (size < 0)
                throw new IllegalStateException();
            data = (T[]) new Object[size];
            currentSize = 0;
        }

        public void add(T item) {
            try {
                data[currentSize++] = item;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of array's bounds!");
            }
        }

        // Задание 3
        public T at(int index) {
            try {
                return data[index - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException(
                        "Out of array's bounds! " + index);
            }
        }

        private boolean isEmpty() {
            return data.length == 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(data);
        }
    }

    // Тест 1
    private void task1() {
        Object[] objectArray = {"String", 1, getClass(), Boolean.TRUE};
        String[] stringArray = {"Hello", "world", "then!"};
        int[] intArray = {4, 71, 5};
        double[] floatArray = {1.2d, 92.42d, 0.007d};

        System.out.println("Objects: " + convertToList(objectArray));
        System.out.println("Strings: " + convertToList(stringArray));
        System.out.println("Integers: " + convertToList(Arrays.stream(intArray).boxed().toArray(Integer[]::new)));
        System.out.println("Doubles: " + convertToList(Arrays.stream(floatArray).boxed().toArray(Double[]::new)));
    }

    // Тест 2
    private void task2And3() {
        GenericsDataKeeper<Integer> ints = new GenericsDataKeeper<>(5);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        System.out.println(ints);

        GenericsDataKeeper<String> strs = new GenericsDataKeeper<>(3);
        strs.add("One");
        strs.add("Two");
        strs.add("Three");
        System.out.println(strs.at(2));
        //System.out.println(strs.at(4)); // - Ошибка
        System.out.println(strs);
    }
}
