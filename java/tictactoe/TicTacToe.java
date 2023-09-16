import java.util.Scanner;


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
        boolean didWin = false;
        // Prints empty board

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

            didWin = checkForWin(gameBoard);
            if (didWin){
                System.out.println("Game over");
                break;
            }

            turn++;

        }
    }

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
    public static void printBoard(String[][] gameBoard){
        // Will print the board out
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard.length; j++){
                System.out.printf("%2s ", gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] addXorO(String[][] board, int position, String character){
        String[][] updatedBoard = board;
        // All the positions to update X and O
        if (position == 1){
            updatedBoard[0][0] = character;
        }
        else if (position == 2){
            updatedBoard[0][2] = character;
        }
        else if (position == 3){
            updatedBoard[0][4] = character;
        }
        else if (position == 4){
            updatedBoard[2][0] = character;
        }
        else if (position == 5){
            updatedBoard[2][2] = character;
        }
        else if (position == 6){
            updatedBoard[2][4] = character;
        }
        else if (position == 7){
            updatedBoard[4][0] = character;
        }
        else if (position == 8){
            updatedBoard[4][2] = character;
        }
        else if (position == 9){
            updatedBoard[4][4] = character;
        }
        else{
            System.out.println("Character not valid");
        }
        return updatedBoard;

    }

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

    public static boolean checkForWin(String[][] board){
        boolean didWin = false;
        // Here's all of the winning lines (I know it's ugly)
        if (((board[0][0].equals("X")) && (board[0][2].equals("X")) && (board[0][4].equals("X"))) || ((board[0][0].equals("O")) && (board[0][2].equals("O")) && (board[0][4].equals("O")))){
            didWin = true;
        }
        else if (((board[2][0].equals("X")) && (board[2][2].equals("X")) && (board[2][4].equals("X"))) || ((board[2][0].equals("O")) && (board[2][2].equals("O")) && (board[2][4].equals("O")))){
            didWin = true;
        }
        else if (((board[4][0].equals("X")) && (board[4][2].equals("X")) && (board[4][4].equals("X"))) || ((board[4][0].equals("O")) && (board[4][2].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        else if (((board[0][0].equals("X")) && (board[2][0].equals("X")) && (board[4][0].equals("X"))) || ((board[0][0].equals("O")) && (board[2][0].equals("O")) && (board[4][0].equals("O")))){
            didWin = true;
        }
        else if (((board[0][2].equals("X")) && (board[2][2].equals("X")) && (board[4][2].equals("X"))) || ((board[0][2].equals("O")) && (board[2][2].equals("O")) && (board[4][2].equals("O")))){
            didWin = true;
        }
        else if (((board[0][4].equals("X")) && (board[2][4].equals("X")) && (board[4][4].equals("X"))) || ((board[0][4].equals("O")) && (board[2][4].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        else if (((board[0][0].equals("X")) && (board[2][2].equals("X")) && (board[4][4].equals("X"))) || ((board[0][0].equals("O")) && (board[2][2].equals("O")) && (board[4][4].equals("O")))){
            didWin = true;
        }
        else if (((board[4][0].equals("X")) && (board[2][2].equals("X")) && (board[0][4].equals("X"))) || ((board[4][0].equals("O")) && (board[2][2].equals("O")) && (board[0][4].equals("O")))){
            didWin = true;
        }
        return didWin;
    }
}

