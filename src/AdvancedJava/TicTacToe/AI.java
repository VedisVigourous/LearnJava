package AdvancedJava.TicTacToe;

import java.util.ArrayList;
import java.util.Random;

public class AI {
    public int pickSpot(LogicTicTacToe game){
        ArrayList<Integer> choiceAvailable = new ArrayList<>();
        for(int i = 0 ; i < 9 ; i++){
//             check for available options and add to the list
            if(game.board[i] == '-'){
                choiceAvailable.add(i+1);
            }
        }
        Random rand = new Random();
        int choicePicked = choiceAvailable.get(rand.nextInt(choiceAvailable.size()));
        return choicePicked;
    }
}