public class WordSearch {
    public static void main(String[] args){
        Character[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board, "SEE"));
    }

    /**
     * This method will search for a word in a grid of characters by searching
     * adjacent cells for characters in the word.
     *
     * @param board An m * n grid of characters (All uppercase)
     * @param word The word that is being searched in
     * @return true if the word is found
     */
    public static boolean exist(Character[][] board, String word){
        // Operations to split word
        Character[] splitWord = new Character[word.length()];
        for (int i = 0; i < word.length(); i++){
            splitWord[i] = word.charAt(i);
        }
        int mLength = board.length;
        int nLength = board[0].length;

        boolean doesExistAdjacent = false;
        Character currentChar = splitWord[0];
        for (int i = 0; i < splitWord.length; i++){
            // iterate over lists of chars
            for (int m = 0; m < mLength; m++){
                // iterate over items in lists of chars
                for (int n = 0; n < nLength; n++){
                    if (board[m][n].equals(currentChar)){
                        if (checkForAdjacent(board, splitWord[i], m, n)){
                            return true;
                        }

                    }
                }
            }
        }

        return false;
    }

    // In LeetCode remove static context
    public static boolean checkForAdjacent(Character[][] board, Character letter, int mPos, int nPos){
        // check up
        if (letter.equals(board[mPos + 1][nPos])){
            return true;
        }
        // check left
        else if (letter.equals(board[mPos][nPos - 1])){
            return true;
        }
        // check right
        else if (letter.equals(board[mPos][nPos + 1])){
            return true;
        }
        // check down
        else if (letter.equals(board[mPos - 1][nPos])){
            return true;
        }
        else{
            return false;
        }

    }

}
