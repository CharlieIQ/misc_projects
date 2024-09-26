import java.io.*;

/**
 * This class is the main runner for DynInventory Program
 */
public class Main {
    public static void main(String[] args){
        // ***USING THIS TO TEST UNTIL I GET JUNIT WORKING***
        Inventory test = new Inventory("tester");

        test.addItems("A2", 1000);
        test.addItems("B1", 1);
        test.addItems("A1", 1);

        test.printInventory();

        test.sortItemsAlphabetically();

        test.printInventory();
    }


}

