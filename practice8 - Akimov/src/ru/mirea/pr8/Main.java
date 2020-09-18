package ru.mirea.pr8;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Main class for testing custom lists
 * @author akimovve
 */
public class Main {

    public static void main(String[] args) {
        WaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        WaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        testCustomLists(boundedWaitList);
        testCustomLists(unfairWaitList);

        UnfairWaitList<String> stringUnfairWaitList = new UnfairWaitList<>();
        System.out.println("stringUnfairWaitList is empty: " + stringUnfairWaitList.isEmpty());
        stringUnfairWaitList.add("One");
        stringUnfairWaitList.add("Two");
        stringUnfairWaitList.add("Three");
        System.out.println("stringUnfairWaitList is empty: " + stringUnfairWaitList.isEmpty());
        System.out.println(stringUnfairWaitList);
        System.out.println(stringUnfairWaitList.remove());
        stringUnfairWaitList.moveToBack("Four");
        System.out.print(stringUnfairWaitList);
    }

    /**
     * @param list - interface
     */
    private static void testCustomLists(WaitList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
        System.out.println("contains 0: " + list.contains(0));
        System.out.println("contains 7: " + list.contains(7));
        System.out.println("remove first: " + list.remove());
        System.out.println("is empty: " + list.isEmpty());
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(4);
        test.add(5);
        System.out.println("contains test-list: " + list.containsAll(test));
        System.out.println();
    }
}
