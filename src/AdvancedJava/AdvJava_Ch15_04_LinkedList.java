package AdvancedJava;

import java.util.LinkedList;

public class AdvJava_Ch15_04_LinkedList {

    /* LinkedList vs ArrayList:
       1. Even though ArrayList are convinient, they overall are themselves an Array that is
       2. After providing, methods to communicate efficiently with them they work like an Array.
          Ex. For Insertion and Deletion of an Element, we need to shift the other elements which costs hardware and time.

       ~To solve this issue LinkedList are introduced as: */

    /* LinkedList:
     1. All the elements are linked to each other in a LinkedList
     2. Imagine it like a snake:
       ~ It includes reference terms like - Previous Value , Current value and Next Value
     3. The Very First value is known as 1. Head
                 last value is known as 2. Tail
     4. To access elements we need to move in a order that is first element -----> element we need.

     NOTE: even though array is time effective while accessing elements but linked list saves it upon element manupulation  i.e.

     * For: Element insertion and deletion, we dont need to shift element we just appoint new value as Next and Prev of existing elements.
        Ex: |2|3|5| now we need to add 11 in between 3 and 5 instead of creating a space by shifting element
            we appoint 11 as next of 3 and prev of 5 hence we obtain |2|3|11|5|

     * Note: It includes all the methods of ArrayList except for (initialCapacity) constructor. */

    public static void main(String[] args) {
        /* Some methods which LinkedList includes but ArrayList doesn't :
           1. addLast() - adds an element as the Tail
           2. element() - retrieves the head of the List
           3. offer() - adds the element as last element of the list (similar methods 1. offerFirst() and 2. offerLast()
           4. peek() , peekFirst() and Last() - retrieves first and last element of the List
           etc. on https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/LinkedList.html#method-summary    */

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Soft Drink");
        shoppingList.add("Veggies");
        shoppingList.add("Noodles");
        shoppingList.add("Fruits");

        // addLast()-
        shoppingList.addLast("Chilli Flakes");

        // addFirst()-
        shoppingList.addFirst("Flour");

        // add(index , element) - same as ArrayList but the inner working is different
        // Note: the element is added after the Index Specified and not on that index
        shoppingList.add(4 , "Ice Cubes");

        System.out.println("Your Shopping List: ");
        for (String elements : shoppingList){
            System.out.println("* " + elements);
        }

        System.out.println();

        // peek()-
        String peek = shoppingList.peek();
        System.out.println(peek);
        String peekLast = shoppingList.peekLast();
        System.out.println(peekLast);

        // offer() - adds an element
        shoppingList.offer("Milk");
        System.out.println(shoppingList); // Notice Milk will also be added to the list at last

        // remove() -
        shoppingList.remove("Noodles");
        System.out.println(shoppingList);
    }
}
