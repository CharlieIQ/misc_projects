import java.math.*;
import java.util.*;
public class TypeSpeedTest {
    List<Word> words;


    public TypeSpeedTest(){
         words = new LinkedList<>();

         for (int i = 0; i < 1000; i++){
             Word w = new Word((int)(Math.random() * 7) + 2);
             w.generateRandomWord();
             words.add(w);
         }
    }

    /**
     * Get list of words
     * @return List of words
     */
    public List<Word> getWords(){
        return words;
    }

    /**
     * Will print every word in list
     */
    public void printWords(){
        for (int i = 0; i < words.size(); i++){
            System.out.print(words.get(i) + " ");
            if (i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
    }
}
