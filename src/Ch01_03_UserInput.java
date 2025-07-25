//Scanner class is used to take input from the user.
//For which import statements are used below is the syntax for it

import java.util.Scanner;     //This is the Scanner Class import statement

public class Ch01_03_UserInput {
    public static void main(String[] args) {       //Shortcut to add the main line is main
        System.out.println("Shortcut is Sout");        //Shortcut to add System out line is sout
        Scanner input = new Scanner(System.in);         //Scanner statement required to initiate user input process
        //Note Scanner is accepted , and scanner isn't whereas
        //System.in is used for taking input from the system's keyboard
        //Scanner statement is followed by variable.nextInt(depends on you which data type u want the user to enter)
        System.out.println("Enter your birth year");
        int Year = input.nextInt();
        System.out.println("Enter month number");
        int Month = input.nextInt();

        //Example Code of Addition of 3 Numbers

        System.out.println("Addition of three numbers");
        Scanner addition = new Scanner(System.in);              //Acts as blank paper
        System.out.print("Enter first number:");
        //int A = addition.nextInt();                              //Acts as Your Answer
        float A = addition.nextFloat();                             //Example for Float data type
        System.out.print("Enter Second number:");
        //int B = addition.nextInt();
        float B = addition.nextFloat();
        System.out.print("Enter third number:");
        //int C = addition.nextInt();
        float C = addition.nextFloat();
        System.out.print("The Sum of the numbers are: ");
        //int sum = A + B + C;
        float sum = A + B + C;
        System.out.println(sum);

        //To validate the user's input data type we use hasnextInt
        Scanner validate = new Scanner(System.in);
        System.out.println("Enter an Integer");       //Can be any data type
        boolean B1 = validate.hasNextInt();       //Create a boolean
        System.out.println(validate.hasNextInt());  // Or directly paste hasnextint() in print statement

        //For Strings (S should always be capital while writing String)
        Scanner S1 = new Scanner(System.in);
        String str = S1.next();//Only Takes first word as input even if Statement is written
        System.out.println(str);    //***To collect whole statement we use .nextLine();
    }
}
