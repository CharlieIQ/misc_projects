/**
 * This class represents an item in the inventory
 */
public class Item {
    private String itemName;

    public Item(String itemName){
        this.itemName = itemName;
    }

    /**
     * Will return item name
     * @return Name of object
     */
    public String getItemName(){
        return itemName;
    }

    // Return name of object
    public String toString(){
        return getItemName();
    }
}
