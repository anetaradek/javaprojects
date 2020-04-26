package selectionSort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
       int a = args.length;
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> unsortedList = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Integer b = Integer.parseInt(args[i]);
            unsortedList.add(b);
        }
        System.out.println(unsortedList);
        while(!unsortedList.isEmpty()) {
            int comparableElement = unsortedList.get(0);
            for (Integer element : unsortedList) {
                if (comparableElement > element) {
                    comparableElement = element;
                }
            }
            sortedList.add(comparableElement);
            unsortedList.remove(Integer.valueOf(comparableElement));
        }

        System.out.println(sortedList);
    }
}