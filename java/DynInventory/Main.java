import java.io.*;

/**
 * This class is the main runner for DynInventory Program
 */
public class Main {
    public static void main(String[] args){
        // ***USING THIS TO TEST UNTIL I GET JUNIT WORKING***
        Inventory test = new Inventory("tester");

        test.addItem("ItemOne");
        test.addItem("ItemTwo");
        test.addItem("ItemThree");

        test.printInventory();

        test.removeOneItem("ItemOne");

        test.printInventory();

        test.addItems("Apple", 2);
        test.addItems("Orange", 3);

        test.printInventory();

        test.removeAllItemsOfOneType("Apple");

        test.printInventory();
    }


}

