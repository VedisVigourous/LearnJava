package Sorting;

import java.util.Arrays;

public class S03_InsertionSort {

        /* Working of The Insertion Sort :
         * It works by sorting parts of the given Array
         * That is the array gets sorted from LHS to RHS and with each pass,
         * The part of array gets sorted that is 1. first two element then first three then four.... so on

         *  Ex. 5 4 3 2 1
         * 1st Pass : (first two) == 4 5 3 2 1
         * 2nd Pass : (first three element) == 3 4 5 2 1
         * 3rd Pass : (first four element) == 2 3 4 5 1
         * 4th Pass : (all the elements gets sorted [this case] == 1 2 3 4 5
         *
         * Note: See the pass (starting from 0) goes till : ArrayLength - 2 [Sorting two element initially to all]
         * At the start that is : 1. i = 0 ; first 2
                                  2. i = 1 ; first 3
                                  3. i = 2 ; first 4
                                  4. i = 3 ; all - i.e. 5 elements :: So i = 5(n) - 2 = 3 */

        /* =========================
            Internal Working of IS
           =========================

           = For an array = { 5 4 3 2 1 }
           = outer-loop or no-of-pass (i) <= length - 2
           = inner-loop (j) / comparisons - { starts from : i + 1 } and compares all the previous element one by one till != 0

             ** Important **
           = Note: If the previous elements comes out to be smaller only : the loop will break
             = Reason : The array is coming sorted from left so the LHS of the element will already be sorted.
         */

    public static void main(String[] args) {

        int [] array = { 5 , 3 , 4 , 2 , 1};
        int length = array.length;

        System.out.println("Unsorted Array: " + Arrays.toString(array));
        System.out.println();

        // Outer Loop - Having no of passes starting from 0 to n - 2 : as for (n-2) all the previous element are sorted
        for (int pass = 0 ; pass <= length - 2 ; pass++) {

            // Comparison started from 2nd element and decrementing till 0 and breaks if previous element it already small
            for (int comparison = pass+1 ; comparison > 0 ; comparison--){

                // Swapping elements if previous is greater
                if(array[comparison-1] > array[comparison]) {
                    int temp = array[comparison-1];
                    array[comparison-1] = array[comparison];
                    array[comparison] = temp;
                }
                else {
                    break;
                }
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(array));
    }
}
