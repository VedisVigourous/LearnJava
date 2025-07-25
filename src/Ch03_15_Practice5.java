import java.util.Scanner;
public class Ch3_15_Practice5 {
    public static void main(String[] args) {
        //Convert String to lower case
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a the string to be converted: ");
        String ustr = inpt.nextLine();
        System.out.println("Entered string in Lower Case is: " + ustr.toLowerCase());

        System.out.println("      ");

        //File name creator
        System.out.print("Enter the name you want to give to your file: ");
        String filename = inpt.nextLine();
        System.out.println("The File Name will be: " + filename.replace(' ' , '_'));

        System.out.println("      ");

        //Letter Template
        String Letter = "Dear <|name|> , \n\tThanks a Lot!!";
        System.out.print("Enter the name to whom you want to send the letter:");
        String name = inpt.nextLine();
        System.out.println(Letter.replace("<|name|>" , name));

        System.out.println("      ");

        //Detect Double and Triple spaces
        System.out.print("Enter your statement: ");
        String statement = inpt.nextLine();
        System.out.println("Does your statement has double space(-1 if not): " + statement.indexOf("  "));
        System.out.println("Does your statement has triple space(-1 if not): " + statement.indexOf("   "));

        System.out.println("      ");

        //Escape Sequence Character
        System.out.println("Dear Vedant\nThis Java Course is nice! \t Thanks");
    }
}
