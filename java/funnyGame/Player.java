public class Player {
    // Player inventory is default length 10
    String[] playerInventory = new String[10];
    int currentDamage, currentHealth;

    public String[] addItemToInventory(String[] inventory, String item){
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] == null){
                inventory[i] = item;
                return inventory;
            }
        }
        return inventory;
    }

    public int attack(int damage, int enemyHealth){
        return enemyHealth - damage;
    }
}
