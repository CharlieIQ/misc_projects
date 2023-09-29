public class Main {
    public static void main(String[] args){
        GameBoard board = new GameBoard();

        board.generateBoard();


        for (int turn = 1; turn <= 9; turn--){
            

            board.printBoard();
        }
    }
}
