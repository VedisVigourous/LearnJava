package AdvancedJava.TicTacToe;

public class LogicTicTacToe {

    // A Tic-Tac-Toe on its basic has a board on which the player plays the game
    protected char[] board;

    // We have to create two variables one for computer and one for the player to select there markers
    protected char userMark;
    protected char compMark;

    // Also one currentMark that updates and the winner!!
    protected char winner;
    protected char currentMark;


    /* ASCII Representation of what we will be going to make:

       0 | 1 | 2           1 | 2 | 3
       ---------           ---------
       3 | 4 | 5   ==      4 | 5 | 6
       ---------           ---------
       6 | 7 | 8           7 | 8 | 9

       It will be a linear array where the user and computer will decide the index on which the mark is to be put up!

       On Gameplay:

       X | O | X
       ---------
       O | X | O
       ---------
       O | O | X

     */

    // First we will have to initialize the array with 9 slots

    public LogicTicTacToe(char userMark, char compMark) {
        this.userMark = userMark;
        this.compMark = compMark;

        // Winner is initialized to a '-'
        this.winner = '-';
        this.board = setBoard();
        this.currentMark = userMark;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }

        return board;
    }

    // We will create a playTurn method which will check for the valid spot to play
    public boolean playTurn(int spot) {
        // valid when in range AND spot is NOT taken
        boolean isValid = isWithinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMark;
            // After current turn we need to pass the turn to next player
            currentMark = (currentMark == userMark) ? compMark : userMark;
        }

        return isValid;
    }

    // Check if the spot is in range
    public boolean isWithinRange(int num) {
        return num > 0 && num < board.length + 1;
    }

    public boolean isSpotTaken(int num) {
        return board[num - 1] != '-';
    }

    public void displayBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(" | ");
                System.out.println(" -------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println(" | ");
    }

    public static void printBoardIndex() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(" | ");
                System.out.println(" -------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println(" | ");
    }

    public boolean isThereAWinner() {
        // Check for winning conditions and common of all - index
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean lastAndThird = (lastRow() || thirdCol()) && board[8] != '-';

        // Now the winner character will be at each condition's common index hence :
        if (diagonalsAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else {
            this.winner = board[8];
        }

        return diagonalsAndMiddles || topAndFirst || lastAndThird;
    }

    // Implementing all the helper functions
    public boolean topRow() {
        return board[0] == board[1] && board[0] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[3] == board[5];
    }

    public boolean lastRow() {
        return board[6] == board[7] && board[6] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[0] == board[6];
    }

    public boolean secondCol() {
        return board[1] == board[4] && board[1] == board[7];
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[2] == board[8];
    }

    public boolean leftDi() {
        return board[0] == board[4] && board[0] == board[8];
    }

    public boolean rightDi() {
        return board[2] == board[4] && board[2] == board[6];
    }

    public boolean isBoardFilled(){
        for(int i=0 ; i< board.length ; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver(){
        boolean didSomeoneWin = isThereAWinner();
        if(didSomeoneWin){
            String result = "The Winner is: " + winner;
            System.out.println(result);
            return result;
        }
        else if (isBoardFilled()){
            String result = "!DRAW!";
            System.out.println(result);
            return result;
        }
        else {
            // game still ongoing
            return "NOT OVER";
        }
    }
}