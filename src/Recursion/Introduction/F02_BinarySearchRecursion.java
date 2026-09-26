package Recursion.Introduction;

public class F02_BinarySearchRecursion {

    /* Thinking Process:
       1. Variables that will be taken as argument in the function
       2. What is the body of the function
       3. When to terminate that is what will be the base case of the functions!
       4. What actually will we return in the function matching to the return type!  */

    static int binarySearch(int[] arr, int target, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = low + (high - low)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target){
            return binarySearch(arr, target, mid+1, high);
        }
        else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {

        int [] arr = {2, 7, 10, 19, 25, 30, 35, 40};
        int target = 25;

        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println((result != -1) ? ("Element " + target + " is found at index: " + result):("Element " + target + " is not found in the array."));
    }
}
