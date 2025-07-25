import java.util.Scanner;
import java.util.Random;
public class Ch04_22_RPSGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random pcinput = new Random();
        System.out.println("  ");
        System.out.println("*****");
        System.out.println("Rules for Rock , Paper and Scissors");
        System.out.println("Rock succeeds over Scissors");
        System.out.println("Scissors succeed over Paper");
        System.out.println("& Paper succeeds over Rock");
        System.out.println("& Paper succeeds over Rock");
        System.out.println("1 - Rock , 2 - Paper and 3 - Scissors");
        System.out.println("*****");
        System.out.println("  ");

        int i = 0;
        while (i <= 5){
            System.out.print("Enter your choice: ");
            int ChoicePlayer = input.nextInt();
            int Computerchoice = pcinput.nextInt(3)+1;

            if (ChoicePlayer == 1){
                System.out.println("You chose - Rock");
            }
            else if (ChoicePlayer == 2) {
                System.out.println("You chose - Paper");
            }
            else if (ChoicePlayer == 3) {
                System.out.println("You chose - Scissors");
            }
            else{
                System.out.println("Enter a valid choice");
                System.exit(101);
            }

            switch (Computerchoice){
                case 1:
                    System.out.println("Computer Chose - Rock");
                    break;
                case 2:
                    System.out.println("Computer Chose - Paper");
                    break;
                case 3:
                    System.out.println("Computer Chose - Scissors");
                    break;
            }

            System.out.println("    ");
            String won = "!!!!! You Won !!!!!";
            String lose = "!!!!! You Lose !!!!!";

            if (ChoicePlayer == 1 && Computerchoice == 3){
                System.out.println(won);
            }
            else if (ChoicePlayer == 2 && Computerchoice == 1) {
                System.out.println(won);
            }
            else if (ChoicePlayer == 3 && Computerchoice == 2){
                System.out.println(won);
            }
            else if (Computerchoice == ChoicePlayer){
                System.out.println("!!!!! It's a Draw !!!!!");
            }
            else {
                System.out.println(lose);
            }
            i++;
            System.out.println("   ");
            System.out.println("   ");
        }
        System.out.println("  ");
        System.out.println("Made by Vedant - 2025\n");
        System.out.println("*******");
    }
}
