public class StraightLine {
    public static void main(String[] args){
        int[][] testOne = {{0, 1}, {0, 1}, {0, -1}};
        // [[0,0],[0,1],[0,-1]]
        System.out.println(checkStraightLine(testOne));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        int diffX = coordinates[0][0] - coordinates[1][0];
        int diffY = coordinates[0][1] - coordinates[1][1];
        int tempX;
        int tempY;

        for (int i = 1; i < coordinates.length; i++){
            tempX = coordinates[i-1][0] - coordinates[i][0];
            tempY = coordinates[i-1][1] - coordinates[i][1];
            if (tempX != diffX || tempY != diffY){
                return false;
            }
        }
        return true;

    }
}