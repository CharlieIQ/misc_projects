public class GameBoard {
    private String[][] board = new String[5][5];

    public String[][] generateBoard(){
        int dimension = board.length;
        for (int i = 0; i < dimension; i++){
            // If row number is even fill with _
            if (i % 2 == 0){
                for (int j = 0; j < dimension; j++){
                    // If item number in row is even put a seperator
                    if (j % 2 == 0){
                        board[i][j] = " ";
                    }
                    else{
                        board[i][j] = "|";
                    }
                }

            }
            // If row number is odd fill with separators
            else{
                for (int j = 0; j < dimension; j++){
                    board[i][j] = "_";
                }

            }
        }

        return board;
    }

    public void printBoard(){

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.printf("%2s ", board[i][j]);
            }
            System.out.println();
        }
    }
}
