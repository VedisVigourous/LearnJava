package Sorting;

import java.util.Arrays;

public class S01_BubbleSort {

    static void BubbleSort(int [] arr) {
        for(int i = 0; i < (arr.length-1) ; i++){
            for(int j = 0 ; j< (arr.length-i-1); j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5 , 4 , 1 , 2 ,3 , 0};

        System.out.println("Initial Array: " + Arrays.toString(arr));

        BubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
