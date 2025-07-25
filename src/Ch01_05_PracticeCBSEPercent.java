import java.util.Scanner;
public class Ch01_05_PracticeCBSEPercent {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Welcome to CBSE Percentage Calculator");
        System.out.print("Enter your Name: ");
        String n2 = n1.nextLine();
        System.out.println("Greetings! "+n2);
        System.out.println("Enter the obtained marks as asked below:");
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter your Physics Marks: ");
        float P = marks.nextFloat();
        System.out.print("Enter your Chemistry Marks: ");
        float C = marks.nextFloat();
        System.out.print("Enter your Mathematics Marks: ");
        float M = marks.nextFloat();
        System.out.print("Enter your Physical Education Marks: ");
        float PE = marks.nextFloat();
        System.out.print("Enter your English Marks: ");
        float E = marks.nextFloat();

        float total = P+C+M+PE+E;
        float percentage = (total/500)*100;

        System.out.print("Well Done Student! Your Obtained Percentage is: "+ percentage);
    }
}
