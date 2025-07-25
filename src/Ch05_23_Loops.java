import java.util.Scanner;
public class Ch05_23_Loops {
    public static void main(String[] args) {

        // Loops are used to perform set of actions repeatedly
        // Types of Loops :-
        // 1. While Loop
        // 2. do - while loop
        // 3. for loop
        // All are used depending on the situation

        //1.While loop
        // It first checks a condition then runs the code
        int a = 1;
        System.out.println("Counting 1 to 5: ");
        while (a <= 5) {
            System.out.println(a); //This repeatedly prints 1
            // for 'a' to increase it's value we need to increment it
            a = ++a;  // Updates the value to incremented value then repeats the loop
        }
        System.out.println("  ");

        //Quick Quiz
        System.out.println("Counting 100 to 200");
        int a1 = 100;
        while (a1 <= 200) {
            System.out.println(a1);
            a1++;
        }
        // An infinite while loop - Commented out so that it does not interrupt the code
        //while (true) {
        // System.out.println("This is an infinite while loop");
        //}
        System.out.println("  ");
        System.out.println("****");

        //2.do while loop
        // Runs at least a single fact and then enters into while loop
        // It runs the code then checks the condition
        int a2 = 1;
        System.out.println("Natural numbers till 10: ");
        do {
            System.out.println(a2);
            a2++;
        } while (a2 <= 10);
        System.out.println("  ");
        // Step by step explanation -
        // 1. Enters the loop with value 1 , 2. checks the condition and repeats itself
        // That is for the first value no condition are being checked
        System.out.println("  ");
        int a3 = 1000;
        do {
            System.out.println(a3);
            a3++;
        } while (a3 <= 10); //Prints a3 for once because do while checks the condition afterward
        System.out.println("  ");
        // Quick quiz
        int nat = 1;
        System.out.println("Natural no 1 to 100: ");
        do {
            System.out.println(nat);
            nat++;
        } while (nat <= 100);

        System.out.println("   ");

        // For loop - used to execute loop for specific number of times
        System.out.println("Following is a for loop: ");
        for (int a4 = 1; a4 <= 13; a4++) { // (initialize ; boolean exp ; condition)
            System.out.println(a4); // for loop is sarv - gun sampann
        }//initialize runs for a single time, boolean is checked after every loop, condition is also checked every time

        // Note all loops are capable of doing the same tasks, depends on your convenience
        System.out.println("   ");
        // Quiz 1
        Scanner odd = new Scanner(System.in);
        System.out.print("Enter how many odd numbers you want to print: ");
        int oddnum = odd.nextInt();
        for (int i = 0; i < oddnum; i++) {
            System.out.println(2 * i + 1);
        }
        System.out.println("  ");
        // Quiz 2
        System.out.print("Enter the max number: ");
        int revord = odd.nextInt();
        for (int r = revord; r!=0; r--) {
            System.out.println(r);
        }

    }
}
