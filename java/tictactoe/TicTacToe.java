// I'm going to style this in accordance with Dal guidelines
// I also wrote this without referencing any other code
import java.util.Scanner;

/**
 * This class will run a game of tic-tac-toe
 * All the methods will work together to make the game functional
 *
 * The game is played in 9 turns, with the first player placing and O and the second placing X.
 * The placement for Xs and Os are lined up like this:
 *  1  |  2 |  3
 *  _  _  _  _  _
 *  4  |  5  | 6
 *  _  _  _  _  _
 *  7  |  8  | 9
 * If a player tries to put an X or O in a taken position, then the player's turn will be skipped.
 * @author Charlie McLaughlin - B00954841
 */
public class TicTacToe {
    public static void main(String[] args){
        // Starts scanner
        Scanner kb = new Scanner(System.in);
        // Initializes position variable
        int position;
        // Initializes character
        String character;
        // Generates board
        String[][] gameBoard = generateBoard(5);
        // Initializes win check
        boolean didWin;
        // Starts turn at 0
        int turn = 1 ;
        // Plays for max of 9 turns
        while (turn <= 9){
            // Player 1 will always play an O
            if (turn % 2 == 0){
                character = "X";
            }
            else{
                character = "O";
            }
            // Prints new turn message
            newTurn(turn);
            // Prints board
            printBoard(gameBoard);
            // Gets inputted position
            position = kb.nextInt();
            // Updates game board to position
            gameBoard = addXorO(gameBoard, position, character);
            // Checks if game has been won or not
            didWin = checkForWin(gameBoard);
            if (didWin){
                // Prints winning player based on turn that is won on
                if (turn % 2 == 0){
                    System.out.println("Player 2 wins");
                }
                else{
                    System.out.println("Player 1 wins");
                }
                printBoard(gameBoard);
                break;

            }

            turn++;

        }


    }

    /**
     * Method used to generate the board.
     * The board will be 5x5 unless specified otherwise.
     * @param dimension the size of the board (default 5 by 5)
     * @return gameBoard the generated game board
     */
    public static String[][] generateBoard(int dimension){
        String[][] gameBoard = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++){
            // If row number is even fill with _
            if (i % 2 == 0){
                for (int j = 0; j < dimension; j++){
                    // If item number in row is even put a seperator
                    if (j % 2 == 0){
                        gameBoard[i][j] = " ";
                    }
                    else{
                        gameBoard[i][j] = "|";
                    }
                }

            }
            // If row number is odd fill with separators
            else{
                for (int j = 0; j < dimension; j++){
                    gameBoard[i][j] = "_";
                }

            }
        }
        return gameBoard;
    }

    /**
     * Method used to print the board.
     * Board items will be split by 2 spaces.
     * @param gameBoard the size of the board (default 5 by 5)
     */
    public static void printBoard(String[][] gameBoard){
        // Will print the board out
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard.length; j++){
                System.out.printf("%2s ", gameBoard[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Method used to update the board.
     * Based on position inputted, position on the 2d board array will be updated to X or O
     * @param board the current state of the board
     * @param position the position that the X or O will go
     * @param character Either X or O based on what turn it is
     * @return board the updated game board
     */
    public static String[][] addXorO(String[][] board, int position, String character){
        // All the positions to update X and O
        if ((position == 1) && (board[0][0].equals(" "))){
            board[0][0] = character;
        }
        else if (position == 2 && (board[0][2].equals(" "))){
            board[0][2] = character;
        }
        else if (position == 3 && (board[0][4].equals(" "))){
            board[0][4] = character;
        }
        else if (position == 4 && (board[2][0].equals(" "))){
            board[2][0] = character;
        }
        else if (position == 5 && (board[2][2].equals(" "))){
            board[2][2] = character;
        }
        else if (position == 6 && (board[2][4].equals(" "))){
            board[2][4] = character;
        }
        else if (position == 7 && (board[4][0].equals(" "))){
            board[4][0] = character;
        }
        else if (position == 8 && (board[4][2].equals(" "))){
            board[4][2] = character;
        }
        else if (position == 9 && (board[4][4].equals(" "))){
            board[4][4] = character;
        }
        else{
            System.out.println("Position already taken!");
        }
        return board;

    }

    /**
     * Method used to print the current turn.
     * Based on if turn is even or odd, Player 1 or 2 will be prompted to play.
     * @param turn the current turn of the game
     */
    public static void newTurn(int turn){
        System.out.println("Turn number " + turn);
        // Will print player prompt based on if turn number is even or odd
        if (turn % 2 == 0){
            System.out.println("Player 2 please put an X position value: ");
        }
        else{
            System.out.println("Player 1 please put an O position value: ");
        }
    }

    /**
     * Method used to check the win status of the game
     * @param board the current game board
     * @return didWin if a winning line exists method wil be true otherwise false
     */
    public static boolean checkForWin(String[][] board){
        boolean didWin = false;
        // Here's all the winning lines
        // Rows
        if (((board[0][0].equals("X")) && (board[0][2].equals("X")) && (board[0][4].equals("X"))) || ((board[0][0].equals("O")) && (board[0][2].equals("O")) && (board[0][4].equals("O")))){
            didWin = true;
        }
        else if (((board[2][0].equals("X")) && (board[2][2].equals("X")) && (board[2][4].equals("X"))) || ((board[2][0].equals("O")) && (board[2][2].equals("O")) && (board[2][4].equals("O")))){
            didWin = true;
        }
        else if (((board[4][0].equals("X")) && (board[4][2].equals("X")) && (board[4][4].equals("X"))) || ((board[4][0].equals("O")) && (board[4][2].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        // Columns
        else if (((board[0][0].equals("X")) && (board[2][0].equals("X")) && (board[4][0].equals("X"))) || ((board[0][0].equals("O")) && (board[2][0].equals("O")) && (board[4][0].equals("O")))){
            didWin = true;
        }
        else if (((board[0][2].equals("X")) && (board[2][2].equals("X")) && (board[4][2].equals("X"))) || ((board[0][2].equals("O")) && (board[2][2].equals("O")) && (board[4][2].equals("O")))){
            didWin = true;
        }
        else if (((board[0][4].equals("X")) && (board[2][4].equals("X")) && (board[4][4].equals("X"))) || ((board[0][4].equals("O")) && (board[2][4].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        // Diagonals
        else if (((board[0][0].equals("X")) && (board[2][2].equals("X")) && (board[4][4].equals("X"))) || ((board[0][0].equals("O")) && (board[2][2].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        else if (((board[4][0].equals("X")) && (board[2][2].equals("X")) && (board[0][4].equals("X"))) || ((board[4][0].equals("O")) && (board[2][2].equals("O")) && (board[0][4].equals("O")))){
            didWin = true;
        }
        return didWin;
    }
}