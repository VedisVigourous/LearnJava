import java.util.Scanner;
public class Ch4_21_Practice8 {
    public static void main(String[] args) {
        //Operator Precedence Question
        int A = 10 + 5 * 2 - 15 / 3;
        // Expected Answer - 10 + 10 - 5 -> 15
        System.out.println("Answer of Precedence and Associativity Answer: " + A);

        System.out.println("   ");

        //Increment Decrement -
        int x = 5; // x = 5
        int y = ++x;  // y = 1+x = 1+5 = 6 , x = 6
        int z = y--; // z = 6(-1) , y = 5 , Ultimately , x = 6 , y = 5 and z = 6
        System.out.printf("x: %d , y: %d , z: %d" , x,y,z);

        System.out.println("   ");

        // String Manipulation
        String str = "Programming in Java";
        System.out.println("Length of string: " + str.length());
        System.out.println("Extracting Java: " + str.substring(str.length()-4));
        System.out.println("String in uppercase: " + str.toUpperCase());

        System.out.println("   ");

        // Operator Result
        boolean x1 = 7%3 == 1 && 10/2 > 4; // true && true = true
        System.out.println("Boolean answer: " + x1);

        System.out.println("   ");

        //Vote eligibility
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        float age = input.nextInt();

        if (age>= 18){
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }

        System.out.println("  ");

        //Logical operators
        boolean isRaining = true;
        boolean hasUmbrella = false;
        boolean isNotRaining = !isRaining;
        if ((isRaining && hasUmbrella) || isNotRaining){
            System.out.println("Let's go outside");
        }
        else{
            System.out.println("Not Today!");
        }

        System.out.println("******");
    }
}
