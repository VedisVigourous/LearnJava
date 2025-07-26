public class Ch14_81_ErrorsinJava {
    public static void main(String[] args) {
        System.out.println();

        /* Errors in any language is a mistake that can be done by the programmer or the machine itself
           Errors occurs with anyone and anywhere , no need to lose hopes just give your best.

           Three types of errors:
           1. Syntax errors
           2. Logical errors
           3. Runtime errors  */

        /* 1. Syntax errors - These errors are done by the programmer while writing the program.
           Ex. int num = 123       ** NO semicolon placed at the end
               num = 456;          ** Datatype not mentioned etc.  */

        /* 2. Logical errors - These errors occur when the program successfully compiles but on execution performs mistakes
           Ex. Upon using a website like YouTube , clicking on like button subscribes the channel, i.e. execution is done but wrongly.
               Or Alarm ringing at incorrect times etc. */

        /* 3. Runtime errors - These error occur when the program is running currently.
           *** Also known as exceptions encounters due to bad-input or resource errors.
              Ex. A site is acquiring data from a different website which suddenly disconnects.
                  You are downloading a game , and your WI-FI disconnects. */

        // Note: A good programmer while writing programs always keep backup of these errors if they occur.

        // Note: Syntax errors are encountered by programmer whereas the Logical and Runtime errors are faced by Users.

        // Difference between Logical and Runtime -
        // Logical error occurs when , we invoke a new program.
        // Runtime error occurs during the execution of a program.


        // Demos of Errors -
        // 1. Syntax Errors already discussed.

        /* 2. Logical error - Wants to do something else and execution is done of something else
           Example - Here writing a code to exchanging values of two variables  */

        // Wrong code
        int a = 5; int b = 10;
        a = b;
        b = a;
        System.out.printf("a: %d , b: %d \n\n" , a,b);

            // Error here is "a" acquires value of b and then b upon acquiring value of a gets updated value that is exchange is not done.
            // To exchange , we need to introduce a new variable;

        // Right Code
        int c = 5; int d = 10;
        int temp = c;
        c = d;
        d = temp;
        System.out.printf("Updated values are:\nc: %d , d: %d\n" , c,d);

        System.out.println();

        /* 3. Runtime error - Gives error when the code cannot handle our input
              Example - We know division of a number by 0 is not defined same goes with java making a calculator that divides 100 by a given number */

        System.out.print("Enter your desired number: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("No number is divisible by 0");
            System.exit(404);
        }
        System.out.println("Dividing 100 by " + num + " : " + 100/num + " \nWith Remainder: " + 100%num);
        // But dividing by 0 gives a runtime error. Can be solved by putting an if statement and more solutions will be discussed in later classes.

        // And much more errors and exceptions exists which we will study further.
    }
}
