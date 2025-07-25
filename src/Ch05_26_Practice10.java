import java.util.Scanner;
public class Ch05_26_Practice10 {
    public static void main(String[] args) {
        //Looping output
        System.out.print("Looping output: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i * 2 + " ");
        } // Expected output: 0 2 4 6 8

        System.out.print("\n");
        System.out.println("  ");

        // While loop Sum
        int sum = 0;
        int a = 1;
        do {
            sum = sum + a;
            a++;
        } while (a <= 10);
        System.out.println("The sum 1 to 10 is: " + sum);

        System.out.println("  ");

        // Positive integer
        System.out.print("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int ask;
        do {
            ask = input.nextInt();
            if (ask > 0){
                System.out.println("Entered int: " + ask);
            }
            else {
                System.out.print("Please enter a positive number: ");
            }
        } while (ask < 0);

        System.out.println("  ");

        //Iteration through integers
        System.out.print("Even integers between 1 to 20: ");
        for (int even = 1; even < 20 ; even++){
            if (even%2 == 0){
                System.out.printf("%d " , even);
            }
        }

        System.out.print("\n");

        // Nested loop
        System.out.println("Star loop: ");
        for (int y = 1; y<=5; y++){ // sets boundary for inner loop
            for (int z = 1; z<=y; z++) {
                System.out.print("*");
            }System.out.print("\n");
        }

        System.out.println(" ");

        // break - breaks a loop and skips to outer code
        // continue - skips outer code and enters the loop again

        // Ex. of break

        System.out.print("Enter an integer: ");
        int ev = input.nextInt();
        int count = 1;
        do {
            if (count==6){
                System.out.println("Reached 5th multiple");
                break; // Skip the loop at 5th multiple
            }
            System.out.printf("%d X %d = %d\n" , ev , count , ev*count);
            count++;
        } while (count<=10);

        System.out.println(' ');

        // Ex. of continue
        System.out.print("Enter an integer: ");
        int ev1 = input.nextInt();
        int count1= 0;
        do {
            count1++;
            if (count1==7){
                System.out.println("Continuing from 8th multiple");
                continue; // Skip the loop at 4th multiple
            }
            System.out.printf("%d X %d = %d\n" , ev1 , count1 , ev1*count1);
        } while (count1<=9);

        //Step-wise explanation of continue;
        // Increments as soon as it enters the loop
        // now on reaching 3 all the code below continue is skipped
        // now again the loop start fresh but count1 evaluates to 3 and again increments
    }
}
