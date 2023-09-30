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
                System.out.printf("%1s ", board[i][j]);
            }
            System.out.println();
        }
    }

    public String[][] addXorO(int position, int turn){
        // O if turn is odd
        String gamePiece = "O";
        // X if turn is even
        if (turn % 2 == 0){
            gamePiece = "X";
        }

        switch (position){
            case 1:
                board[0][0] = gamePiece;
                return board;
            case 2:
                board[0][2] = gamePiece;
                return board;

            case 3:
                board[0][4] = gamePiece;
                return board;

            case 4:
                board[2][0] = gamePiece;
                return board;
            case 5:
                board[2][2] = gamePiece;
                return board;

            case 6:
                board[2][4] = gamePiece;
                return board;

            case 7:
                board[4][0] = gamePiece;
                return board;
            case 8:
                board[4][2] = gamePiece;
                return board;

            case 9:
                board[4][4] = gamePiece;
                return board;
        }
        return board;
    }
}
