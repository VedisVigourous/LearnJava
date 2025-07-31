import java.util.Scanner;
import java.util.Random;

class LuckyDraw{
    int guessedNumber1;
    int guessedNumber2;
    int triesleft=4;
    int tries=1;
    int [] counting;

    public LuckyDraw() {
        Random computer = new Random();
        this.guessedNumber1 = computer.nextInt(0,20);
        this.guessedNumber2 = computer.nextInt(0,20);
    }

    public void arrayDefine(){
        Random computer = new Random();
        int guessedNumber = computer.nextInt(0,20);
        this.counting = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    public void Lotteryguess(){
        Scanner numberInput = new Scanner(System.in);

        System.out.println("! Welcome to Lottery Claiming Portal !");
        System.out.println("You'll have 5 tries , Guess numbers 0 - 20 in order to win lottery../");

        try{
            while (this.tries<=5){
                System.out.println();
                System.out.println("Enter the number you think matches the lottery?");
                System.out.print("Number: "); int noGuessed = numberInput.nextInt();
                System.out.print("Confirmation of selected number: ");
                System.out.println(counting[noGuessed]);

                if (noGuessed != guessedNumber1 && noGuessed != guessedNumber2){
                    System.out.println("Wrong number , TRY YOUR LUCK AGAIN");
                    System.out.println("Tries Left: " + this.triesleft);
                    this.triesleft--;
                }
                else{
                    System.out.println("CONGRATULATIONSSS !!!!!\nYOU WONNN !!!!");
                    System.out.println("Please visit , Lottery office to claim your lottery!");
                    break;
                }

                tries++;



                if (this.tries == 6){
                    System.out.println();
                    System.out.println("***********************");
                    System.out.println("Out of Attempts noww...");
                    System.out.println("***********************");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayLength){
            System.out.println("Number Less than 20 was asked !!");
        }

    }
}
public class Ch14_88_Practice22 {

    // Q3 - Code
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);

        // Q1. Java code to demostrate Syntax error , logical error and Runtime error.
        // Syntax -
        System.out.println("Syntax Error: ");
        System.out.println("This is an /tEscape /nSequenced /'statement/'"); // There is a syntax fault within this string, as disussed earlier , Escape sequence requires bwd slash not fwd.
        System.out.println("This is an \tEscape \nSequenced \'statement\'");

        System.out.println();

        // Logical -
        System.out.println("Logical Error: ");
        System.out.println("Program to print Remainder");
        System.out.print("Enter the Dividend: "); int dividend = input.nextInt();
        System.out.print("Enter the Divisor: "); int divisor = input.nextInt();
        System.out.println("The Remainder is : " + dividend/divisor); // Logic is wrong as to print remainder '%' is required and not '/'

        System.out.println();

        // Runtime -
        System.out.println("Runtime Error:");
        String emailBody = null;
        try {
            System.out.println("Character used in Email's Body: " + emailBody.length()); // Gives a null pointer Exception as emailBody doesn't contain anything.
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        // Surrounding in try-catch , so that the code written further is not harmed.

        System.out.println();

        // Q2. Write a program that throw "Haha" on ArithmeticException and "Hehe" on Invalid Argument Exception
        System.out.println("Percentage Calculator: ");
        System.out.print("Enter your total marks: "); float totalMarks = input.nextInt();
        try {
            if (totalMarks > 500) {
                throw new IllegalArgumentException();
            }
            if (totalMarks == 0){
                throw new ArithmeticException();
            }
        }
        catch (IllegalArgumentException totalMarkserror){
            System.out.println("HeHe");
            System.exit(901);
        }
        catch (ArithmeticException Zerototalmarks){
            System.out.println("HaHa");
            System.exit(902);
        }
        System.out.print("Enter the marks obtained: "); float obtainedMarks = input.nextInt();

            float percentage = (obtainedMarks/totalMarks)*100;
            System.out.println("Percentage obtained is: " + percentage);
            if(percentage>90){
                System.out.println("Grade: A+");
            }
            else if (percentage > 80) {
                System.out.println("Grade: A");
            }
            else if (percentage > 75) {
                System.out.println("Grade: B+");
            }
            else if (percentage > 60) {
                System.out.println("Grade: B");
            }
            else if (percentage > 45) {
                System.out.println("Grade: C");
            }
            else{
                System.out.println("Failed");
            }

            System.out.println();

            // Q3. Program that allows user to Access an array max uptil 5 times (needs to access valid entries) and after 5 tries print error.
            LuckyDraw obj = new LuckyDraw();
            obj.arrayDefine();
            obj.Lotteryguess();

    }
}
