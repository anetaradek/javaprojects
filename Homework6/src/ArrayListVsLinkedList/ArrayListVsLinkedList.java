package ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        long begginingTime = System.currentTimeMillis();
        List<Integer> arraylist= new ArrayList<>();

    }
}
//Save the system time as a start point. System.currentTimeMillis()
//Create ArrayList of Integers.
//Prepare loop for 100_000 iterations.
//Inside of loop add to list new element, but at 0 position. add(0, number). As a number you can use an i from loop, for example. Or anything else.
//After loop save end point system time.
//Printout to console time spent to loop execution.
//
//Repeat previous steps, but this time create LinkedList of Integers.
//Compare execution time for both cases.
//
//Save another one start point time.
//Create loop from 0 to 100_000, and inside of loop get from previously created ArrayList elements by index i, so get(i)
//Save end point time.
//Printout to console execution time.
//
//Repeat getting steps but for previously created LinkedList.
//Compare execution time.
//
//Why execution time is different? How you can explain it?