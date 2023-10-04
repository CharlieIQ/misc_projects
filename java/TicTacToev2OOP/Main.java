import java.util.Scanner;

/**
 * This class will run a game of Tic Tac Toe using OOP.
 * It is the same as my other one, but it saves at least 150 lines of code.
 */
public class Main {

    public static void main(String[] args){
        GameBoard board = new GameBoard();
        Scanner kb = new Scanner(System.in);
        board.generateBoard();


        for (int turn = 1; turn <= 9; turn++){
            System.out.println("Turn #" + turn +"\nPlayer: " + ((turn % 2) + 1));
            board.addXorO(kb.nextInt(), turn);

            board.printBoard();

            if (board.didWin()){
                System.out.println("Player " + (turn % 2 + 1) + " wins!");
                break;
            }
        }
        System.out.println("End of game");
    }
}
