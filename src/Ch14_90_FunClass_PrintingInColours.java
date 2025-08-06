import java.util.Scanner;

public class Ch14_90_FunClass_PrintingInColours {
    // Codes-
    public static String RESET = "\u001B[0m";
    public static String RED = "\u001B[31m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Printing in a specific colour Requires to Set ANSI codes:
           Say , a variable RED ->
           It includes Syntax
           public static String RED = "ANSI code";
              Here , public - access modifier
                     static - joins the code to class
                     String - denotes Variable type
                     RED    - Variable Name (preffered color name)
                     ANSI codes are specific to the color.  */

        // Note : Whtie is called Reset as it again sets the colour to default.


        System.out.print("Enter a Statement: "); String statement = input.nextLine();
        System.out.println();
        System.out.println("RED: " + RED + statement + RESET);
        System.out.println("GREEN: " + GREEN + statement + RESET);
        System.out.println("YELLOW: " + YELLOW + statement + RESET);
        System.out.println("BLUE: " + BLUE + statement + RESET);
        System.out.println("WHITE: " + RESET + statement + RESET);
    }
}
