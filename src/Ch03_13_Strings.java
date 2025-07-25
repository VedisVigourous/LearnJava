import java.util.Scanner;
public class Ch03_13_Strings {
    public static void main(String[] args) {
        //Strings are sequence of characters
        //Strings are case sensitive
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


    }
}
