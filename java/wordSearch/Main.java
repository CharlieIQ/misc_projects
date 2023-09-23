import java.util.Random;

/**
 * This code will generate a random wordsearch board from scratch
 * with 1 pre-determined word
 *
 * @author Charlie McLaughlin
 */
public class Main {
    public static void main(String[] args){
        // Here's the mystery word (has to be length board size - 1)
        String mysteryWord = "nuts";
        // Here's the board
        int boardSize = 15;
        Character[][] gameBoard = new Character[boardSize][boardSize];
        // Generate Board
        gameBoard = generateBoard(gameBoard, boardSize);
        // Place word
        placeWord(gameBoard, mysteryWord);
    // Print board
        printBoard(gameBoard, boardSize);
    }

    public static Character getRandomLetter(){
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return letters[generateRandomNum(letters.length)];
    }

    public static int generateRandomNum(int range){
        Random rand = new Random();
        return rand.nextInt(range);
    }
    public static Character[][] generateBoard(Character[][] emptyBoard, int boardSize){
        for (int i = 0; i < boardSize; i++){
            for (int j = 0; j < boardSize; j++){
                emptyBoard[i][j] = getRandomLetter();
            }
        }
        return emptyBoard;
    }

    public static void printBoard(Character[][] board, int boardSize){
        for (int i = 0; i < boardSize; i++){
            for (int j = 0; j < boardSize; j++){
                 System.out.printf("%2c ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static Character[][] placeWord(Character[][] board, String word){
        // for word length
        int wordLength = word.length();
        // for board size
        int boardSize = board.length;
        // For random position
        int xPos = generateRandomNum(boardSize);
        int yPos = generateRandomNum(boardSize);
        // Down or up random (0 right) (1 down) (2 left) (3 up) (4
        int orientation = generateRandomNum(8);
        // Check for boundary
        xPos = checkForBoundary(wordLength, boardSize, xPos, orientation);
        yPos = checkForBoundary(wordLength, boardSize, yPos, orientation);
        // Split the word (into uppercase)
        Character[] splitUpWord = splitWord(word.toUpperCase());

        // Place first point
        board[xPos][yPos] = splitUpWord[0];

        for (int x = 0; x < boardSize; x++){
            for (int y = 0; y < boardSize; y++){
                if (board[x][y].equals(splitUpWord[0])){
                    // For right
                    if (orientation == 0){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x][y + i] = splitUpWord[i];
                        }
                    }
                    // for down
                    else if (orientation == 1){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x + i][y] = splitUpWord[i];
                        }
                    }
                    // for left
                    else if (orientation == 2){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x][y - i] = splitUpWord[i];
                        }
                    }
                    // for up
                    else if (orientation == 3){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x - i][y] = splitUpWord[i];
                        }
                    }
                    // up left
                    else if (orientation == 4){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x - i][y - i] = splitUpWord[i];
                        }
                    }
                    // up right
                    else if (orientation == 5){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x - i][y + i] = splitUpWord[i];
                        }
                    }
                    // bottom left
                    else if (orientation == 6){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x + i][y - i] = splitUpWord[i];
                        }
                    }
                    // bottom right
                    else if (orientation == 7){
                        for (int i = 0; i < splitUpWord.length; i++){
                            board[x + i][y + i] = splitUpWord[i];
                        }
                    }

                }

            }
        }
        cleanBoard(board, splitUpWord);
        return board;
    }

    public static Character[] splitWord(String word){
        Character[] splitWord = new Character[word.length()];

        for (int i = 0; i < word.length(); i++){
            splitWord[i] = word.charAt(i);
        }

        return splitWord;
    }

    // going to cause problems probably
    public static int checkForBoundary(int wordLength, int boardSize, int position, int orientation){
        // For right
        if (orientation == 0){
            while (wordLength + position > boardSize - 1){
                position--;
            }
        }
        // For down
        else if (orientation == 1){
            while (wordLength + position > boardSize - 1){
                position--;
            }
        }
        // For left
        else if(orientation == 2){
            while (position - wordLength <= 0){
                position++;
            }
        }
        // for up
        else if(orientation == 3){
            // Check for less than boundary
            while (position - wordLength <= 0){
                position++;
            }
        }
        // up left
        else if (orientation == 4){
            while (position - wordLength <= 0){
                position++;
            }
            while (wordLength + position > boardSize - 1){
                position--;
            }

        }
        // up right
        else if (orientation == 5){
            while (position - wordLength <= 0){
                position++;
            }
            while (wordLength + position > boardSize - 1){
                position--;
            }
        }
        // down left
        else if (orientation == 6){
            while (position - wordLength <= 0){
                position++;
            }
            while (wordLength + position > boardSize - 1){
                position--;
            }
        }
        // down right
        else if (orientation == 7){
            while (position - wordLength <= 0){
                position++;
            }
            while (wordLength + position > boardSize - 1){
                position--;
            }
        }
        return position;
    }

    public static Character[][] cleanBoard(Character[][] board, Character[] splitWord){

        for (int x = 0; x < board.length; x++){
            for (int y = 0; y < board.length; y++){
                for (int i = 0; i < splitWord.length; i++){
                    if (board[x][y].equals(splitWord[i])){
                        board[x][y] = (Character.toLowerCase(board[x][y]));
                    }
                }
            }
        }

        return board;
    }
}
