package AdvancedJava;

public class AdvJava_24_Heaps {
    public static void main(String[] args) {

        /* Trees are distributed in
           1. Root
           2. Leaves where,
           - Each root is connected to its child or leaves where, the child have no relationship with each others

           - Types of Heaps:
             1. Min-Heap: The root value is smaller compared to its children's value.
                - Children could be anything, but greater than its root.
                - Note: The same structure is followed throughout the branches ahead.

                Ex.                 20             20
                                   | |      ==    | |
                                 100 105       100  105

                - But for a third branch,

                                   20
                                  | |
                                105 90
                                    |
                                   100          {100 Cannot be attached to 105 as 100<105 and the min-head condition becomes false!

               2. Max-Heap: Same as min heap but the value of root is greatest this time!

                Ex.                    10
                                      /   \
                                     8     5
                                    / \   / \
                                   5   4 3  1        Note: 5 could also be attached to the 5 at second root as max condition is : >= */


        /* If we number max heap according to there order:
               10 = 1
                8 = 2
                5 = 3
                5(under 8) = 4
                4 = 5
                3 = 6 and
                1 = 7

                can be aligned as [ 1  2 3 4 5 6 7 ]
                                = [ 10 8 5 5 4 3 1 ] and can be




           !! Now to access child of a tree -> { Parent's(index) * 2 } and add as many child's you want
                        :: parent of a tree -> {Child's(index) / 2 } */

    }
}
