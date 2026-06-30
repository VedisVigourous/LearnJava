package Searching;

import java.util.Scanner;

public class Sch_01_LinearSearch {

    /* Linear Search : It is the algorithm to find a target element in a given Data Structure!
       * It is used to linearly or one by one iterate over all the elements in the given DS until the element is found!

       * Time Complexities:
         * Best Case : O(1) - When the element is at the first position in the collection
         * Worst Case : O(N) - Where the N is the size of the collection given! i.e. to iterate fully over the collection!

     */

    /* Pseudocode :
       -----------

       function(arr , target):
           for i = 0 to Size(arr):
               if arr[i] == target:
                   return "Position = i"
               End if
           End for
           else return -1

      * Note: If searching by element that is [a for each loop] - then we would have to return some other constant as -1 could be an element in the array!

     */

    static int LinearSearch(int [] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {9 , 6 , 2 , 5 , -8 , 12 , 7 , -18};

        System.out.print("Enter a Number to Find: ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        int result = Sch_01_LinearSearch.LinearSearch(arr , target);

        if(result != -1){
            System.out.println("Element found at index = " + result);
        }
        else {
            System.out.println("Element not Found! ");
        }
    }
}
