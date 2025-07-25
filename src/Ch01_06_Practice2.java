import java.util.Scanner;
public class Ch01_06_Practice2 {
    public static void main(String[] args) {

    //Kilometers to Miles

        System.out.print("Enter your Distance in Kilometer: ");Scanner km = new Scanner(System.in);
        float k1 = km.nextFloat();
        float kmtm = (k1 * 0.621f);

        System.out.println("Your distance in miles is: " + kmtm);

        //Detecting whether the number is Integer or not
        System.out.print("Enter an integer: ");
        boolean d1 = km.hasNextInt();
        System.out.println("Detecting Integer result: " + d1);
    }
}
