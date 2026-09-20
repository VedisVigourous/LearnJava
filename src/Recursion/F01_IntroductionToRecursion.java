package Recursion;

public class F01_IntroductionToRecursion {

    static void greet(int count){
        if(count == 5){
            return;
        }

        System.out.println("Greetings, User!");
        greet(count + 1);
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

           */



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
    }
}
