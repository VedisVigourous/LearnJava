package Sorting;

import java.util.Arrays;

public class S02_SelectionSort {
    public static void main(String[] args) {
        /* In selection sort unlike other algos
         * We will select a particular element until it is placed on the right place.

         * STEPS
         * 1. Selects the largest element among all
         * 2. Place it on the correct position by swapping the elements
         * 3. Check for the remaining array ... so on

         * Ex. Array = { 4 , 5 , 1 , 2 , 3}
         * Largest Element = 5 ; Array = { 4 , 3 , 1 , 2 , 5}
         * Largest Element (remaining array) = 4 ; Array = {2 , 3 , 1 , 4 , 5}
         * Largest Element (remaining array) = 3 ; Array = {2 , 1 , 3 , 4 , 5}
         * Largest Element (remaining array) = 2 ; Array = {1 , 2 , 3 , 4 , 5} = Sorted !!

         * Note: Vice-versa can also be done i.e. picking up of least element and placing it. */


        /* Complexity = No of Comparisons
         * It makes comparisons starting from 1 to n-1 , where n = no of total elements
         * And sum of No of comparisons = sum of natural number = n(n-1)/2 = n² - n / 2
         * Removing constants and taking highest degree = [ Time Complexity == n² ] */


        // ********************************* //


        int [] arr = { 14 , 12 , 5 , 8 , 20 , 1 , 19 , 0};

        System.out.print("Initial Array: " + Arrays.toString(arr) + "\n\n");


        /* Note: The max no of steps taken to sort will be upto = (n - 1)
         * Taking (n-1)-1 because, the last element remaining will have only the correct place to settle after multiple swaps */

        for(int pass = 0 ; pass < (arr.length) - 1  ; pass++) {

            /* Finding of the max - element in the array and placing to appropriate index
             * Ex. for an array of length = 5 , for pass = 0 , largest element should be on 4th index
             * Formula should be = (5 - 0 - 1) === (length - pass - 1) */

            int lastIndex = arr.length - pass - 1;

            // Determining the Index of element of max-value
            int maxIndex = 0;
            for(int i = 0 ; i <= lastIndex ; i++){
                if(arr[i] >= arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swaps elements only if - the maximum element is not at last-desired index
            if(maxIndex != lastIndex) {
                int temp = arr[lastIndex];
                arr[lastIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }

        System.out.print("Sorted Array: " + Arrays.toString(arr) + "\n");
    }
}
