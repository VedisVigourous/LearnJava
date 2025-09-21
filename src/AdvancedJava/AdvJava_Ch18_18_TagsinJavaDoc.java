package AdvancedJava;

/* Tags are used to put a header to the javadoc:
   It includes different types such as author , version etc. which is used to classify who has prepared the javadoc.

   Popular Tags:
   Description - First line of tags syntax (Understand syntax in line 15)
   ** If added more lines above tags - it works as paragraph displayed above the tags (HTML tags can be used here to make text more immersive)
   @author - Tells who made the doc
   @since - Specifies the initial time the doc was made
   @see - Includes other relevant data which author may include (includes link insertion from html)
   @version - Tells the release version of doc (can be changed by author each time with update in javadoc

   || Syntax ||
   /** - Comment starting
   * Description - If you want one
   * Tags
   End of comment */


// Writing tags in line 19 to 22

/**
 * Learning to generate javadoc
 * <p> Today is 21/09/2025 - And I am learning JavaDocs </p>
 * @author - VedisVigourous
 * @version - 0.1
 * @since 2025
 *
 * @see <a href= "https://docs.oracle.com/en/java/javase/24/"> Refer to JavaDocs </a> // Note: This is Link Insertion
 */


// Important Note: Tags are not included above a package statement but if used above:
//    1. class - it gives info of the class
//    2. method - gives info for the method.

public class AdvJava_Ch18_18_TagsinJavaDoc {

    /* Taking an example of a simple method to print the sum of two integers */
    static void Sum(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter Num 1: "); int num1 = input.nextInt();
        System.out.print("Enter Num 2: "); int num2 = input.nextInt();
        System.out.println();        System.out.printf("The Sum of %d and %d is: %d" , num1 , num2 , num1+num2);
    }
    public static void main(String[] args) {
        Sum();
    }
}
