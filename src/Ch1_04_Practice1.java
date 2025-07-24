import java.util.Scanner;
public class Ch1_04_Practice1 {
    public static void main(String[] args) {

        //Simple input from user
        System.out.print("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String N = name.nextLine();
        System.out.println("Hello, " + N + "! You're Welcome to the world of Programming!");

        //Calculator
        System.out.println("Welcome to 4 Operation Calculator");
        Scanner arithmetic = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        float A = arithmetic.nextFloat();
        System.out.print("Enter the Second Number: ");
        float B = arithmetic.nextFloat();
        System.out.print("Enter the Third Number: ");
        float C = arithmetic.nextFloat();

        float sum = A + B + C;
        System.out.println("The Sum of the Numbers are: " + sum);
        float difference = A - B - C;
        System.out.println("The difference is: " + difference);
        float multiplication = A*B*C;
        System.out.println("The Product is: " + multiplication);
        float division = (A/B)/C;
        System.out.println("Division is as follows: "+ division);

        //Area of Cuboid
        System.out.println("Let's Calculate the Area of A Cuboid");
        Scanner area = new Scanner(System.in);
        System.out.print("Enter the length of the Cuboid: ");
        float l = area.nextFloat();
        System.out.print("Enter the Breadth of Cuboid: ");
        float b = area.nextFloat();
        System.out.print("Enter the Height of Cuboid: ");
        float h = area.nextFloat();
        float ar = l*b*h;
        System.out.println("The Area of Cuboid is: "+ ar);
    }
}
