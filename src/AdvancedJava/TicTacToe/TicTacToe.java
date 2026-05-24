package AdvancedJava.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        boolean doYouWannaPlay = true;
        while(doYouWannaPlay){
            System.out.println("=============================");
            System.out.println(" !! WELCOME TO TIC-TAC-TOE !!");
            System.out.println("=============================");

            System.out.println("\n\n");
            System.out.print("Pick a Character that represent you on the Board: "); char userMark = obj.next().charAt(0);
            System.out.print("Pick a Character that represent your Opponent on the Board: "); char compMark = obj.next().charAt(0);

            LogicTicTacToe game = new LogicTicTacToe(userMark , compMark);
            AI ai = new AI();

            // Setting up the game
            System.out.println("\n\n");
            System.out.println("Now We Can Start The Game, 'Enter a number to place your token'\n':: Choice must be from 1-9'");
            LogicTicTacToe.printBoardIndex();
            System.out.println();

            // Let's Play:
            while(game.gameOver().equals("NOT OVER")){
                if(game.currentMark == game.userMark){
                    System.out.println("It's your Turn! Enter a Spot for your mark: ");
                    int spot = obj.nextInt();
                    while(!game.playTurn(spot)){
                        System.out.println("Try Again as: " + spot + " is already Taken or Out Of Range!");
                        spot = obj.nextInt();
                    }
                    System.out.println("You Picked: " + spot + "!");
                }
                else {
                    // AI's Turn
                    System.out.println("It's my turn!");
                    int AISpot = ai.pickSpot(game);
                    game.playTurn(AISpot);
                    System.out.println("I picked : " + AISpot + "!");
                }
                // Printing new Board
                System.out.println();
                game.displayBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();

            // Set up a new Game!?
            System.out.print("Do you wanna Play Again!? Y or N? ");
            char response = obj.next().charAt(0);
            doYouWannaPlay = (response == 'Y');
            System.out.println("\n\n");
        }
    }
}
