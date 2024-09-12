import java.io.*;

public class Main {
    public static void main(String[] args){
        // Create file
        try {

            File myObj = new File("inventory.txt");
            // Log if file was made
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            // Catch file creation error
            }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("inventory.txt");
            myWriter.write("Glorb");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

