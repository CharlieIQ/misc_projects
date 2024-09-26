import java.util.ArrayList;

/**
 * This class is for the main inventory system
 */
public class Inventory {
    private String inventoryName;
    private ArrayList<Item> inventoryItems;

    public Inventory(String inventoryName){
        this.inventoryName = inventoryName;
        inventoryItems = new ArrayList<>();
    }

    /**
     * Add one item to inventory
     * @param name Name of item to add
     */
    public void addItem(String name){
        Item newItem;
        newItem = new Item(name);
        inventoryItems.add(newItem);
    }

    /**
     * Add multiple items to inventory
     * @param name Name of object
     * @param amount Amount of objects to add
     */
    public void addItems(String name, int amount){
        Item newItem;

        for (int i = 0; i < amount; i++){
            newItem = new Item(name);
            inventoryItems.add(newItem);
        }
    }

    /**
     * Remove one item of given name
     * @param name Name of item to remove
     */
    public void removeOneItem(String name){
        for (int i = 0; i < inventoryItems.size(); i++){
            if (inventoryItems.get(i).getItemName().equals(name)){
                inventoryItems.remove(i);
                break;
            }
        }
    }

    /**
     * Removes all items of one type
     * @param name Name of item
     */
    public void removeAllItemsOfOneType(String name){
        for (int i = 0; i < inventoryItems.size(); i++){
            if (inventoryItems.get(i).getItemName().equals(name)){
                inventoryItems.remove(i);
            }
        }
    }

    /**
     * Remove every item in inventory
     */
    public void removeAllItems(){
        for (int i = 0; i < inventoryItems.size(); i++){
            inventoryItems.remove(i);
        }
    }

    /**
     * Will sort items in list alphabetically
     *
     * Uses bubble sort O(n^2)
     */
    public void sortItemsAlphabetically(){
        int inventorySize = inventoryItems.size();
        // Create temporary objects
        Item temp1;
        Item temp2;

        // Sort Array
        boolean wasSwapped;
        for (int i = 0; i < inventorySize; i++){
            wasSwapped = false;
            for (int j = i + 1; j < inventorySize; j++){
                if (inventoryItems.get(i).getItemName().compareTo(inventoryItems.get(j).getItemName()) > 0) {
                    temp1 = inventoryItems.get(i);
                    temp2 = inventoryItems.get(j);

                    inventoryItems.remove(j);
                    inventoryItems.remove(i);


                    inventoryItems.add(i, temp2);
                    inventoryItems.add(j, temp1);

                    wasSwapped = true;
                }
            }
            // If list was already sorted, just exit
            if (!wasSwapped){
                break;
            }
        }
    }

    /**
     * Return an array of all items in inventory
     * @return Array of Item[]
     */
    public Item[] itemsInInventory(){
        Item[] items = new Item[inventoryItems.size()];

        for (int i = 0; i < items.length; i++){
            items[i] = inventoryItems.get(i);
        }

        return items;
    }

    public String getInventoryName(){
        return inventoryName;
    }
    /**
     * Will print the inventory items in order
     */
    public void printInventory(){
        System.out.println(inventoryItems);
    }
}
