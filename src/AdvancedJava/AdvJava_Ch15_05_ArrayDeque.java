package AdvancedJava;

import java.util.ArrayDeque;

public class AdvJava_Ch15_05_ArrayDeque {

    /* ArrayDeque (DoubleEmmit Queue) - When we want ot dynamically insert and delete values from both ends and start of an array, we get support from ArrayDeque
     * They doesn't have any size restriction and extends as per user requirement. */

    /* Syntax to Initialize -
       ArrayDeque<DataType> Listname = new ArrayDeque<>(*Possible constructors); */

    /* Constructors -
       1. (empty) - hold 16 elements as its initial capacity
       2. (int capacity) - holds elements of a specified capacity
       3. (collection) - extends the element of specified list

       Methods - all the methods of an LinkedList (some exceptions) https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ArrayDeque.html#method-summary:
       ** does not contain - get(index)
       1. push(element) - adds the specified element to the beginning of the ArrayDeque
       2. pop() - removes the first element of the ArrayDeque   */


    public static void main(String[] args) {
        System.out.println();
        ArrayDeque<String> employees = new ArrayDeque<>();
        employees.offer("Roy");
        employees.offer("Rahul");
        employees.offer("Krish");
        employees.offer("Samarth");
        employees.offer("Joseph");
        employees.offerFirst("Vedant");
        employees.offerLast("Rohit");

        System.out.println("Employee List: ");
        for(String employee : employees){
            System.out.println("* " + employee);
        }

        /* Important note: using add , get and remove in Deque may result in exceptions (index) to play on safe side we use:
           add() --> offer()
           get() --> peek()
           remove() --> poll()
         */

    }
}
