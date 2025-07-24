import java.util.Random;
import java.util.Scanner;

class guessGame{
    int compGuess;
    int noGuesses = 1;
    private int userGuess;

    public guessGame(){
        Random randomNumber = new Random();
        compGuess = randomNumber.nextInt(0,100);
    }
    public int getCompGuess(){
        return compGuess;
    }
    public void UserInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you think is right!: ");userGuess = input.nextInt();
        if (userGuess>100){
            System.out.println("Enter a Number Smaller than 100");
            System.exit(1011);
        }
        else if (userGuess>compGuess){
            System.out.println("Your guessed number is Greater than the Computer's number! Try Again\n");
            noGuesses++;
            UserInput();
        }
        else if (userGuess<compGuess){
            System.out.println("Your guessed number is Smaller than the Computer's number! Try Again\n");
            noGuesses++;
            UserInput();
        }
        else if (userGuess == compGuess){
            System.out.println();
            System.out.println("Congratzz !!! You achieved it !!!");
            getNoGuesses();
            System.out.println("Computers Number was: " + getCompGuess());
            System.out.println();
            System.out.println("|| Made by Vedant ||");
            System.out.println("|| Java - 2025 ||");
        }
    }
    public int getNoGuesses(){
        System.out.println("No of attempts: " + noGuesses);
        return noGuesses;
    }
}
public class Ch9_42_GuessTheNumber {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("\t\t\t\t\t\t\t  ******");
        System.out.println();
        System.out.println("\t\t\t\t\t\t ! Game Rules !");
        System.out.println("\t\t\t| Computer will Guess A Number up-till 100 |");
        System.out.println("\t\t\t\t  | You will have to guess it |");
        System.out.println("\t\t| Lower the number of Guesses Better is The Score |");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t  ******");
        System.out.println();

        guessGame userinp = new guessGame();
        userinp.UserInput();
    }
}
