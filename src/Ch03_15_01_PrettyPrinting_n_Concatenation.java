import java.util.ArrayList;

public class Ch03_15_01_PrettyPrinting_n_Concatenation {
    public static void main(String[] args) {
        /* Pretty Printing refers to the printing of a formatted type of string
           - We use the printf method to print formatted strings
           - Format specifiers are used to print the value within the string!  */

        System.out.printf("Value of PI in 3 decimal places is %.3f", Math.PI);

        /* .3 is used to declared to show only the first three decimal values */


        System.out.println();


        /* String Concatenation in java
           - Concatenation is the technique used to join strings together  */

        // Character concatenation -> returns the ASCII Values
        System.out.println("Concatenating Characters: " + ('a' + 'b'));
        /* Since printing character returns character ASCII we can add integer and typecast to char */
        System.out.println("Typecasting to char: " + (char)('a' + 5));

        // Concatenating of two string -> joins them up
        System.out.println("Concatenating String: " + ("a" + "b"));

        /* For Concatenating String with another datatype ->
           - toString() method works on the other data-type i.e. for example
           "a" + 5 => "a" + "5" == a5  */

        System.out.println("\nString Concatenation with another datatype: " + ("a" + 5));

        // Example 2
        System.out.println("Empty List: " + new ArrayList<>());

        /* Note: The Addition (+) operator works only on primitive datatypes
           -> For non-primitive variables we could introduce a string in between to allow .toString() method to work!   */


        // System.out.println(new Integer(15) +  new ArrayList<>());  // - Gives error as + operator doesn't work on non-primitive methods
        System.out.println("Non-Primitve Variables with String Included: " + (new Integer(15) + " " + new ArrayList<>()));


        System.out.println();
    }
}
