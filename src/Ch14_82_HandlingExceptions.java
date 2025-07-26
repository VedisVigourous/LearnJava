public class Ch14_82_HandlingExceptions {
    public static void main(String[] args) {
        System.out.println();

        /* Exceptions in Java -
           - It refers to stopping of a running program when it encounters problems which differs from normal set of Instructions.
           - Two types of Exceptions:
             1. Checked Exceptions - These are compile time exception (checked by compiler)
             2. Unchecked Exceptions - Runtime Exception

             * Some Commonly occuring exceptions are -
             1. Null Pointer Exceptions ~ Occurs when program tries to execute objects which have null value.
             2. Arithmetic Exceptions ~ Occurs in arithmetic operation like Division by 0
             3. ArrayIndexOutofBound Exceptions ~ Occurs when accessing an array's Index which doesn't exist. Ex. Accessing 7th element when the array only contains 5 elements.
             4. IllegalArgument Exceptions ~ When the passed argument doesn't match the code's requirements. Ex. Putting a string when the asked value is an Integer.
             5. NumberFormat Exceptions ~ Occurs when converting data types. Ex. Converting "Hello" to Integers isn't possible.    */

        // Handling Exceptions -
        /* 1. try {} catch (){}
              It tries to execute a program and catch statement catches if any error occurs.
              Without harming the code written further. */


        // We know , ArithmeticException occurs on dividing a number by 0 using try-catch to solve

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter num1 : "); int num1 = input.nextInt();
        System.out.print("Enter num2 : "); int num2 = input.nextInt();

        try {
            int quotient = num1 / num2;
            System.out.println("Quotient of num1/num2: " + quotient);
        }
        catch (RuntimeException error){
            System.out.println("Error: " + error);
        }

        System.out.println("Operation ended."); // It will be printed even after Exceptions occurs because try-catch doesn't harm the further written codes.

        // Note: If try-catch was not present - the code would have exited after encountering an Exception and "Operation Ended" would have not been printed.
    }
}

/* In a nutshell:
   1. try-catch executes a program even though exceptions are likely to occur
   2. it exits out the try-catch block without exitting the whole program that is any code written outside it will still be executed */
