package Recursion.Introduction;

public class F01_IntroductionToRecursion {

    static void greet(int count){
        if(count == 5){
            return;
        }

        System.out.println("Greetings, User!");
        greet(count + 1);
    }

    static int fibonacciNo(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacciNo(n-1) + fibonacciNo(n-2);
    }
    public static void main(String[] args) {

        /* ============
            RECURSION
           ============

           -> It is the practice of a function to call itself at the runtime
           -> Holds a base-condition for termination otherwise calls itself with desired conditions!


           ============
            STRUCTURE
           ============

           function(parameter) {
             // base condition

             // recursive call within body
           }


           ===========
            APPROACH
           ===========

           -> If a function can be broken down into smaller sub-problems.
           -> Draw the recursive tree and the recurrence relation!
              -> Tree -> the left side is solved first depending on the function call and then move to the right!
              -> Always determine the flow of function to create the tree!
           -> If a function can be solved by calling itself with smaller inputs.   */



        /* Example - Greeting for 5 times using the same function */
        F01_IntroductionToRecursion.greet(1);

        /* Working of the Greet Function ->
           1. Takes up a parameter count number
           2. Within the function body - calling the function again for increment of the count
           3. hence with each time the count is incrementing and will run until the base condition is satisfied! */




        /* ===============================
            WORKING / CALLING OF FUNCTION
           ===============================

           -> A function stays in the stack until it finishes its executions.
           -> On execution the functions are removed from the stack and
           -> Value is restored to where the function was called!
           -> Stack follow LIFO!

           -> For the [ Greet function ] stack will be like -
              # Attached Image as :: 01_CallingOfStack.png


           ====================
            RECURSIVE CALLING
           ====================

           -> Recursion call diagram added in folder as
              :: 02_RecursionCall.jpg   */



        /* ===========================
            WHY DO WE NEED RECURSION
           ===========================

           -> It helps us solve bigger problems by breaking them down into smaller problems.
           -> It allows us to save space in memory as the same function is called again and again instead of creating new functions for each problem.
         */






        /* Fibonacci ->
           -> recursive formula -
              F(n) = F(n-1) + F(n-2)

              -> It is the Recurrence Relation
              # Recurrence Relation -> It is the expression which shows the recursive formula of the problem!  */
        System.out.println(F01_IntroductionToRecursion.fibonacciNo(1));




        /* =======================================
             Working with variables in Recursion
           =======================================
           Variables are used in following and should be taken care of ->
           1. Argument
           2. Return types
           3. Body of the function!   */


        /* Binary Search using Recursion

           # Recurrence Relation -> Divides into halves after each call!
             -> The Mid - finding is done in constant time O(1) first!
              -----------------------
             | F(n) = O(1) + F(n/2) |
             ------------------------    */

        /* --------------------------------
            TYPES OF RECURRENCE RELATIONS
           --------------------------------

           1. Linear Recurrence Relation (Fibonacci)
              -> Original problem is just changed in size linearly with each call!

           2. Divide and Conquer Recurrence Relation (Binary Search)
              -> Dividing the problem by factors of the original size!



           # Inefficiency of Linear Recurrence Relations
             -> Recursive calls gets repeated like in fibonacci numbers of calculation f(5)
             -> f(5) - f(4) + f(3) and then f(4) again calls f(3) + f(2)
             -> That is, f(3) is calculated repeatedly making it inefficient!    */
    }
}
