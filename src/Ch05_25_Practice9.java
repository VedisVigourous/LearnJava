import java.util.Scanner;
public class Ch05_25_Practice9 {
    public static void main(String[] args) {
        //Star pattern
        System.out.println("Star pattern: ");
        for(int i = 4; i != 0 ; i--){ //Outer loop - runs until a whole inner loop from 0 - 4 is completed
            for (int j=0; j<i ; j++ ){ //Inner loop - runs from 0 to value of i
                System.out.print("*"); // for first loop i = 4 , j runs till 3 so , 0123 , four stars are printed contd.
            }
            System.out.print("\n"); // Prints a line after inner loop is completed
        }
        System.out.println("  ");

        //Sum of first n even numbers
        System.out.print("Enter the number greatest even number: ");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = x1/2;
        int sum = 0;
        System.out.print("Sum of even number are: ");
        for (int x = 0; x<=x2; x++){
            sum = sum + (2*x);
        }
        System.out.print(sum + "\n");


        System.out.println("  ");

        // Multiplication table of a number
        System.out.print("Enter the number: ");
        int table = input.nextInt();
        int t1 = 1;
        System.out.printf("The table of %d\n" , table);
        do {
            int product = table*t1;
            System.out.printf("%d X %d = %d\n" , table,t1,product);
            t1++;
        } while (t1<=10);
        System.out.println("  ");

        // Table of 10 in reverse order
        System.out.println("Table of 10 in reverse order is: ");
        for (int g = 10; g != 0 ; g-- ){
            System.out.printf("10 X %d = %d\n" , g , 10*g);
        }
        System.out.println("  ");

        // Finding factorial of a given number
        System.out.print("Enter a number to find it's factorial: ");
        long fact = input.nextLong();
        long factorial = 1;
        long fact1 = fact+1;
        for (long f1 = fact1; f1!=1 ; f1--){
            factorial = factorial * (f1-1);
        }
        System.out.println("Factorial is " + factorial);
    }
}
