package Sorting;

import java.util.Arrays;

public class S05_CyclicSort {

    /* Cyclic Sort -> Unlike other sorting methods having complexities of O(n²)!
       - Works on comparing in O(n) comparisons!

       # WHEN TO USE ->
         -> When provided a range of numbers from { 1 to N }

       # APPROACH
       -> 1. When we get a range of jumbled numbers
          Ex.   3 5 4 2 1

          The numbers on sorting must lie on -> index = value - 1

          i.e.   0 1 2 3 4 - Index
                 1 2 3 4 5 - Value

         * 2. That is we have to swap the value from first index to its correct position
           3. Check again the swapped value, if correct move ahead!

        # Note: The last element remaining after each other are at correct place
                - The last will be automatically at the correct place!


        IN SHORT -> CHECK -> SWAP -> MOVE */

    static int[] cyclicSort(int [] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] == arr[correctIndex]){
                i++;
            }
            else {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 4, 2, 6, 1};

        System.out.println(Arrays.toString(cyclicSort(arr)));

    }
}
