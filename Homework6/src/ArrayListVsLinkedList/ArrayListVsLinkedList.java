package ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        arrayList();
        linkedList();

        System.out.println("Execution time to store elements in arrayList is longer because we save element\n" +
                " via index, whereas in linkedList elements are connected to the previous and next element,\n" +
                " so we just save our element as next element");
        System.out.println("Execution time for getting elements in arrayList is faster because we just get the element\n" +
                "by it's index, whereas in linkedList elements are connected to the previous and next element, \n" +
                "so we get access to target element via first element through next elements until \n" +
                "we get to our target element");
    }

    public static void arrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long begginingTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            if (i == 0) {
                arrayList.add(0, i);
            } else arrayList.add(i);
        }
        long endingTimeArrayList = System.currentTimeMillis();
        long totalLoopTimeArrayList = endingTimeArrayList - begginingTimeArrayList;
        System.out.println("ArrayList adding total iteration time " + totalLoopTimeArrayList);

        long begginingTimeArrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(i);
        }
        long endingTimeArrayList2 = System.currentTimeMillis();
        long totalLoopTimeArrayList2 = endingTimeArrayList2 - begginingTimeArrayList2;
        System.out.println("ArrayList getting total iteration time " + totalLoopTimeArrayList2);
    }

    public static void linkedList () {
        List<Integer> linkedList = new LinkedList<>();
        long begginingTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            if (i == 0) {
                linkedList.add(0, i);
            } else linkedList.add(i);
        }
        long endingTimeLinkedList = System.currentTimeMillis();
        long totalLoopTimeLinkedList = endingTimeLinkedList - begginingTimeLinkedList;
        System.out.println("LinkedList adding total iteration time " + totalLoopTimeLinkedList);


        long begginingTimeLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.get(i);
        }
        long endingTimeLinkedList2 = System.currentTimeMillis();
        long totalLoopTimeLinkedList2 = endingTimeLinkedList2 - begginingTimeLinkedList2;
        System.out.println("LinkedList getting total iteration time " + totalLoopTimeLinkedList2);
    }
}