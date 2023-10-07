import java.util.Scanner;

// Definitely NOT a Wordle rip off
public class wordMatch {
    public static void main(String[] args){
        // Initialize scanner
        Scanner kb = new Scanner(System.in);
        // This is the word that'll be used
        String word = "balls";
        // Initializes user guess
        String guess;
        // For guess visualiser
        int[] matchStorage;
        // Boolean for checking if user wins
        boolean win;
        // List of characters in word that'll be iterated over
        Character[] charsInWord = new Character[word.length()];
        // Creates array for characters
        charsInWord = generateCharArray(charsInWord, word);
        // Starts turn counter to be the length of the word
        int turn = word.length();
        // Loop that will iterate over turns
        while(turn > 0){
            // Prints what turn it is
            System.out.println(turn + " turns left! \nPlease enter a "+ word.length() + " letter word:");
            // User input:
            guess = kb.next();
            // Checks and prints if character exists
            doesLetterExist(guess, charsInWord);
            // Updates guess visualiser
            matchStorage = checkUserGuess(guess, charsInWord);
            // Checks if user won
            win = didWin(guess, word);
            if (win){
                System.out.println("You win!");
                break;
            }
            // Increments turn by -1
            turn--;


        }

    }

    public static Character[] generateCharArray(Character[] charArray, String word){
        for (int i = 0; i < word.length(); i++){
            charArray[i] = word.charAt(i);
        }
        return charArray;
    }

    public static int[] checkUserGuess(String userGuess, Character[] charsInWord){
        // Char array for user guess
        Character[] temporaryArray = new Character[userGuess.length()];
        int[] indicesOfMatches = new int[userGuess.length()];
        String[] guessVisual = new String[userGuess.length()];

        for (int i = 0; i < userGuess.length(); i++){
            temporaryArray[i] = userGuess.charAt(i);
            if (temporaryArray[i].equals(charsInWord[i])){
                // Will add the position in word where the characters are equal
                indicesOfMatches[i] = userGuess.indexOf(temporaryArray[i]) + 1;
            }
        }
        // Set up visual
        Character[] visual = new Character[userGuess.length()];
        for (int i = 0; i < userGuess.length(); i++){
            if ((indicesOfMatches[i]- 1) == i){
                visual[i] = temporaryArray[(indicesOfMatches[i]- 1)];
            }
        }
        // Filler
        System.out.println("=======================================");
        // Print Visual
        String filler = "*";
        for (int i = 0; i < userGuess.length(); i++){
            if (visual[i] == null){
                visual[i] = filler.charAt(0);
            }
            System.out.print(visual[i] + " ");
        }
        // Filler
        System.out.println("\n=======================================");

        // For matching values
        return indicesOfMatches;
    }

    public static void doesLetterExist(String userGuess, Character[] charsInWord){
        Character[] temporaryArray = new Character[userGuess.length()];
        for (int i = 0; i < userGuess.length(); i++){
            temporaryArray[i] = userGuess.charAt(i);
        }

        for (int i = 0; i < temporaryArray.length; i++){
            for (int j  = 0; j < temporaryArray.length; j++){
                if (temporaryArray[i].equals(charsInWord[j])){
                    System.out.println("The character " + temporaryArray[i] + " exists in the mystery word!");
                }
            }
        }
    }
    public static boolean didWin(String userGuess, String word){
        boolean didUserWin = false;
        if (userGuess.equals(word)){
            didUserWin = true;
        }
        return didUserWin;
    }
}
