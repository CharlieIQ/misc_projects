import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Player user = new Player();

        user.addItemToInventory(user.playerInventory, "Sword");

        System.out.println(Arrays.toString(user.playerInventory));
    }

    public static int prompt(){
        return 2;
    }
}
