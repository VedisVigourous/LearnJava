package Searching;

public class Sch_02_BinarySearch {
    /*
      Binary Search: It is a very optimized Searching algorithm where the no-of-steps taken to find the element is significantly very less!
      * It takes almost half the steps to search the element as it does not traverse over all the elements!
      * [ Note: The Array provided must be sorted! ]

      * Time Complexities:
        * Best Case - O(logN)
        * Worst Case - O(N)
     */

    /*
     : Pseudocode :
     BinarySearch(array , target):
        start <- 0
        end <- length(array)-1
        mid <- (start + end)/2

        while(start <= end):
            if array[mid] < target then, start = mid + 1
            else if array[mid] > target then , end = mid - 1
            else if array[mid] = target , return I
            End If
        End While
     */

    static int BinarySearch(int [] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else if (arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {2 , 4 , 10 , 26 , 39 , 48 , 79 , 100};
        int target = 39;

        int result = Sch_02_BinarySearch.BinarySearch(array , target);

        if(result != -1){
            System.out.printf("Element found at %d !" , result);
        }
        else {
            System.out.println("Element not present! ");
        }

    }
}
