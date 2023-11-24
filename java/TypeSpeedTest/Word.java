import java.util.*;
import java.math.*;
public class Word {
    String word = "";
    private int wordLength;

    public Word(int wordLength){
        this.wordLength = wordLength;
    }

    /**
     * Get word
     * @return Word
     */
    public String getWord(){
        return word;
    }

    /**
     * Will generate a random existent or nonexistent word (More than likely nonexistent)
     */
    public void generateRandomWord(){
        // Arrays of letters
        char[] englishConsonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] englishVowels = {'a', 'e', 'i', 'o', 'u'};
        // Pick between 1 and 2 for first letter
        int pickForFirstLetter = (int)(Math.random() * 2);
        // Pick random from consonants
        int getRandomConsonantIndex = (int)(Math.random() * englishConsonants.length);
        // Pick random from vowels
        int getRandomVowelIndex = (int)(Math.random() * englishVowels.length);
        // Word repeating chance
        int characterRepeating = (int)(Math.random() * 5) + 1;
        // So a word can't repeat character more than once
        boolean didRepeat = false;

        for (int i = 0; i < wordLength; i++){
            // For first letter in word
            if (i == 0){
                // First letter is Consonant
                if (pickForFirstLetter == 0){
                    word += englishConsonants[getRandomConsonantIndex];
                    word = word.toUpperCase();
                    getRandomConsonantIndex = (int)(Math.random()*englishConsonants.length);
                }
                // First letter is vowel
                else{
                    word += englishVowels[getRandomVowelIndex];
                    word = word.toUpperCase();
                    getRandomVowelIndex = (int)(Math.random()*englishVowels.length);
                }
            }

            // JUST FOR SECOND LETTER (Just to deal with capitalizing words)
            if (i == 1){
                boolean isConsonant = true;
                for (char c : englishVowels){
                    if (c == word.toLowerCase().charAt(0)){
                        isConsonant = false;
                        break;
                    }
                }

                if (isConsonant){
                    word += englishVowels[getRandomVowelIndex];
                    getRandomVowelIndex = (int)(Math.random()*englishVowels.length);

                }
                else{
                    if (characterRepeating == 5 && !didRepeat){
                        word += word.toLowerCase().charAt(0);
                        characterRepeating = (int)(Math.random()*2)+5;
                        didRepeat = true;
                    }
                    else{
                        word += englishConsonants[getRandomConsonantIndex];
                        getRandomConsonantIndex = (int)(Math.random()*englishConsonants.length);
                        didRepeat = false;
                    }
                }
            }

            // FOR PAST SECOND LETTER
            if (i > 1){
                boolean isConsonant = true;
                for (char c : englishVowels){
                    if (c == word.charAt(i - 1)){
                        isConsonant = false;
                        break;
                    }
                }

                if (isConsonant){
                    word += englishVowels[getRandomVowelIndex];
                    getRandomVowelIndex = (int)(Math.random()*englishVowels.length);
                }
                else{
                    if (characterRepeating == 5 && !didRepeat){
                        word += word.charAt(i-1);
                        characterRepeating = (int)(Math.random()*2)+5;
                        didRepeat = true;
                    }
                    else{
                        word += englishConsonants[getRandomConsonantIndex];
                        getRandomConsonantIndex = (int)(Math.random()*englishConsonants.length);
                        didRepeat = false;
                    }
                }
            }
        }
    }

    /**
     * Return string value of word
     * @return String value of word
     */
    public String toString(){
        return word + " ";
    }
}
