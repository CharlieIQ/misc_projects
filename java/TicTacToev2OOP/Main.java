import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        GameBoard board = new GameBoard();
        Scanner kb = new Scanner(System.in);
        board.generateBoard();


        for (int turn = 1; turn <= 9; turn++){
            System.out.println("Turn #" + turn +"\n");
            board.addXorO(kb.nextInt(), turn);

            board.printBoard();
        }
    }
}
