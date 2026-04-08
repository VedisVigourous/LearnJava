package Sorting;

import java.util.Arrays;

public class S01_BubbleSort {

    /* Intro to Bubble Sort: [also known as Sinking Sort or Exchange Sort]
       - It is a simple sorting algorithm that compares adjacent elements and swaps them if they are in the wrong order.
       - The process is repeated until the entire array is sorted.
       - Each array traversal is called a "pass". After each pass, the largest unsorted element is moved to its correct position.

        Loop Boundary Conditions:
        - Outer Loop: from 0 to length - 1:
                      - Because the iteration will not cover the last remaining element as it will be in its desired position automatically
        - Inner Loop: from 0 to length - i - 1:
                      - We don't need to cover the last element as with each pass the largest element will be at last index. i.e. already sorted.


        * Complexity of Bubble Sort:
          - Worst Case: BigO - O(n²)
          - Best Case: BigO - O(n) [when the array is already sorted]
          - Average Case: BigO - O(n²)  */

    /* Note: Stable vs Unstable Sorting Algorithms: [The same element disorder]
       - A stable sorting algorithm maintains the relative order of records with equal keys (i.e., values).
       - An unstable sorting algorithm may change the relative order of records with equal keys.
       - Bubble Sort is a stable sorting algorithm because it only swaps adjacent elements when they are in the wrong order, thus preserving the relative order of equal elements. */

    static void BubbleSort(int [] arr) {
        for(int pass = 0; pass < (arr.length-1) ; pass++){
            for(int compare = 0 ; compare< (arr.length-pass-1); compare++){
                if (arr[compare] > arr[compare+1]) {
                    int temp = arr[compare+1];
                    arr[compare+1] = arr[compare];
                    arr[compare] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3 , 1 , 5 , 4 , 2 , 0};

        System.out.println("Initial Array: " + Arrays.toString(arr));

        BubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
