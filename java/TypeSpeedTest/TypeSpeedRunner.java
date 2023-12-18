import java.util.*;
public class TypeSpeedRunner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Alter size of test
        int sizeOfTest = 10;

        String MAIN_MENU = "MAIN MENU\n" +
                "Enter 1 to start test\n" +
                "Enter 0 to quit";
        int option = -1;
        // Game runner loop
        while (option != 0){
            System.out.println(MAIN_MENU);

            option = in.nextInt();

            if (option == 1){
                TypeSpeedTest tst = new TypeSpeedTest(sizeOfTest);
                System.out.println("Begin!");
                int score = 0;
                for (int i = 0; i < sizeOfTest; i++){
                    String currentWord = tst.getWords().get(i).getWord();
                    System.out.println(currentWord);
                    String userType = in.next();
                    if (currentWord.equals(userType)){
                        System.out.println("Correct!");
                        score++;
                    }else{
                        System.out.println("Wrong :(");
                    }

                }
                System.out.println("Score: " + score + "/" + sizeOfTest);
            }
        }

        System.out.println("DONE");
    }
}
