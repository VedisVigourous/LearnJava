import java.util.Scanner;
public class Ch04_18_RelLogicOperators {
    public static void main(String[] args) {

        //Logical Operators: 1. && - AND , || - OR  and ! - NOT
        //Provides logic in java program

        // && - used for two situations to be true (else evaluate false)
        // || - used for either situation to be true (evaluate false if both are false)

        //Example for and:
        int a = 5;
        int b = 2;
        int c = 12;
        boolean Z = c>a&&c>b;
        System.out.println("12 is greater than 5 and 2: " + Z);

        boolean Z1 = c>a && a>b;
        System.out.println("12 is greater than 5 and 5 is greater than 2: " + Z1);

        boolean Z2 = c>a && b>a;
        System.out.println("12 is greater than 5 and 2 is greater than 5: " + Z2);

        boolean Z3 = c>a || b>a;
        System.out.printf("Either 12 is greater than 5 or 2 is greater than 5: %b\n" , Z3);

        boolean Z4 = a!=b;
        System.out.printf("5 is not equal to 12: %b\n" , Z4);

        boolean Z5 = a==b;
        System.out.println("5 is equal to 12: " + Z5);

        //Using in If-Else Statement
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int A1 = input.nextInt();
        if (A1>18 && A1<80) {
            System.out.println("You are Eligible to Drive");
        }
        else{
            System.out.println("Not eligible to drive");
        }




    }
}
