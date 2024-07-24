import java.util.*;

public class Main {
    /*
    Game loop
     */
    public static void main(String[] args){
        // Create world map
        Tile[][] worldMap = new Tile[5][5];
        Tile currentTile;
        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 5; j++){
                currentTile = new Tile(i, j);
                worldMap[i][j] = currentTile;
            }
        }

        printMap(worldMap);
    }

    public static void printMap(Tile[][] map){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(map[i][j]);
            }
        }
    }
}