package Sorting;

import java.util.Arrays;

public class S04_CountSort {

    /* Intro to Count Sort:
     * It is a non-comparison based sorting algorithm.
     * Preferred for smaller numbers

     # STEPS Include:
     1. Create an array of (largest_element + 1) length of given array
     2. Now we will traverse through the array and according to element present in original array
     3. We will, add the frequency of the number in the new array at the { position = number in original array. }
     4. Finally: The original array is changed by filling up elements according to their frequency linearly.

     * ASCII Art

        I.    | 2 | 3 | 1 | 3 | 6 | 2 | 3 | 1 | Here frequency of: 0 is 0
                                                                   1 is 2
                                                                   2 is 2
                                                                   3 is 3
                                                                   4 is 1

        II.  So a new frequency of size = [largest + 1] = [6+1] = 7
        Index: 0   1   2   3   4   5   6
             | 0 | 2 | 2 | 3 | 0 | 0 | 1 |

        III. Now linearly fill the frequencies to array left to right:

            | 1 | 1 | 2 | 2 | 3 | 3 | 3 | 6 | ==== Is the sorted array


       # WHAT ACTUALLY IS HAPPENING?
       * We are counting the number of times a number is occuring in the array and filling the frequency in a sorted method.
       * That is, the frequency of 1 is filled first then 2 and so on.
       * Hence, on filling the array form left to right we approach from least to large number occurance and fills it accordingly.
       * And, finally get a sorted array.


       # Complexity:
       * First we are traversing the first array of size: n
       * Then the frequency array of size: m
       * So worst case = O(n+m) */



    /* NOTE : A hashmap can be used to store the number and its frequency instead of an array as key-value pair.
     * And, accordingly create an array of size = no of unique elements in the original array and fill it according to the frequency of the number.
     * But, it is not preferred as it will take more space and time to store the key-value pair in hashmap and then traverse through it to fill the original array.  */


    public static void countSort(int [] array){
        // If only one or no array exist
        if(array == null || array.length <= 1){
            return;
        }

        // STEP1: Finding largest element
        int largestElement = array[0];
        for(int elem : array){
            if (elem > largestElement){
                largestElement = elem;
            }
        }

        // STEP2: Creating a frequency array of size = largestElement + 1
        int [] freqArray = new int[largestElement+1];

        // STEP3: Filling the new array with the frequency of elements in original
        for(int num: array){
            freqArray[num]++;
            /* Note: We will increment the value of the index = number occuring in original array
             * i.e. if 2 occurs we increment value of 2nd index by 1 => Value = 1
             * if it again occurs, increment 2nd index again by 1 => Value = 2  */
        }

        // STEP4: Filling the original array according to the frequency of elements in new array
        int index = 0;
        for(int freqIndex = 0; freqIndex < freqArray.length ; freqIndex++){
            while(freqArray[freqIndex] > 0){
                array[index] = freqIndex; // Filling the original array with the number according to the frequency
                index++; // Moving to next index of original array
                freqArray[freqIndex]--; // Since while loop is running until, the frequency is greater than 0, we will have to reduce used up frequency
            }
        }

    }
    public static void main(String[] args) {
        int [] arr = { 2 , 3 , 1 , 3 , 6 , 2 , 3 , 1 };

        System.out.println("Initial Array: " + Arrays.toString(arr));

        countSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
