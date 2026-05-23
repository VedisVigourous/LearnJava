package AdvancedJava.BinarySearchTrees;

public class AdvJava_25_BinarySearchTrees {

    /* Unlike Heaps:

       - Binary Search Trees have a relation between Parent and Child nodes:
         - Where, Left child is smaller than the root and right is greater !

         Ex. For 7,8,9  =            8
                                    / \
                                   7   9      where 7<8 and 9>8
                                  /
                                 5                                   */


    /* Trees can also be implemented as arrays: here 8 = 1
                                                     7 = 2
                                                     9 = 3
                                                     5 = 4

       So,      [ 8 7 9 5 ] = { 1 2 3 4 }

       - To get Parent: Child's(index) / 2
         Ex. 5 is @ 4 then : 4/2 = 2 => 7 hence, 5 is a child of 7

       - To get Child: Parent's(index) * 2 = Left Child
                       Parent's(index) * 2 + 1 = Right Child  */

    public static void main(String[] args) {

        /* Process of Making:
           - A interface implementing 1. non-empty bst
                                      2. empty bst
           - And add other methods having features to manipulate the BST */

    }
}
