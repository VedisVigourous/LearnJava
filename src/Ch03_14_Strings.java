import java.util.Scanner;
public class Ch03_14_Strings {

    /* String is the most commonly used class of Java!
       - Every string created is the object of type string!

        AS -> String      name   =    "Str";
               |           |           |
           data-type   <referable>   value


       Concepts ->
       1. String Pooling - It is an optimization technique in java where if two strings even on having two different names
                           -> Will point to the same memory address if the value of both is same!

                           i.e. a = "Vedant" and b = "Vedant"   -> both pointers 'a' and 'b' will point the same address!


       2. String Immutability - Strings cannot change the original value assigned instead on updating of the string
                                - A new object is made with the new value

             - It prevent value change of each variable pointing to a single object on any update!


              P1 ---------\
              P2           ---------------\
              P3                           ----  "Name"
              P4 ------------------------/

              - On changing value of, any of the given variable, a new object will be made
                - Rather than changing the value of all the variables pointing the same object! */


    public static void main(String[] args) {
        //Strings are sequence of characters
        //Strings are case-sensitive
        String name = new String("Vedant");
        System.out.println(name);

        //Due to the relevance of Strings , we can use it just like a data type
        //Example:
        String name1 = "Vedant";
        System.out.println(name1);

        //String are immutable and cannot be changed afterward
        //Different ways to print Java;
        //print , println(program shift to next line after printing) , printf (uses format specifier)
        //Some format specifiers are :
        //%d - int , %f - float , %c - char and %s - string
        // different commands for format specifiers are;
        int a = 12;
        String relation = "mom";
        System.out.printf("She is my %s and her birthday is on April %d" , relation , a);
        //or
        System.out.format("::She is my %s and her birthday is on April %d" , relation , a); // same as printf
        System.out.println("*******");

        //To obtain a string from User
        Scanner name2 = new Scanner(System.in);
        System.out.print("Enter ur name: ");
        String urname = name2.nextLine();
        System.out.printf("Ur name is %s  " , urname);

        //Interesting facts about Formatting Strings
        float f1 = 14.3422f;
        System.out.printf("The float is %f" , f1);  //Prints the Whole Float
        System.out.printf("  The float is %.2f" , f1);  //Prints the  number of decimal places specified (Here 2)
        System.out.printf("  The float is %5.2f" , f1); //Adjust the whole float within specified Spaces
                                                      //Numbers after decimal is considered as single space
                                                      //Includes the main number + . + the whole decimal part (3 space)




        /* Comparisons of String ->
           - On using the '==' comparator
           - It checks the reference pointer rather than just values
             - Returns, 'true' if the pointer points to a single object!
                        'false' otherwise!    */

        String st1 = "Vedant";
        String st2 = "Vedant";
        System.out.println("\n\nComparing Variables: " + (st1 == st2));

        /* True because -> String Pool comes into play and both points to the same object */

        // Explicitly creating different objects

        String stob1 = new String("Vedant");
        String stob2 = new String("Vedant");
        System.out.println("Comparing explicitly created 2 objects: " + (stob1 == stob2));

        /* Explanation-
           - Since, the objects are now made outside pool as two different objects
           - Hence, comparator will now return 'false' */
    }
}
