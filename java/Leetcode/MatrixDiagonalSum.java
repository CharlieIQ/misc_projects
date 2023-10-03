public class MatrixDiagonalSum {
    public static void main(String[] args){
        // NOT DONE
        int[][] mat1 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat3 = {{5}};
        System.out.println(diagonalSum(mat1)); // 8
        System.out.println(diagonalSum(mat2)); // 25
        System.out.println(diagonalSum(mat3)); // 5
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;

        if (length == 1){
            return mat[0][0];
        }
        // Even
        if (length % 2 == 0){
            for (int i = 0; i < (length/2) - 1; i++){
                for (int j = 0; j < length; j++){
                    if (j == (j + i) || j == (i - j)){
                        sum += mat[i][j];
                    }
                }
            }
            for (int i = length - 1; i >= (length/2) - 1; i--){
                for (int j = 0; j < length; j++){
                    if (j == (i - j) || j == (i - 1)){
                        sum += mat[i][j];
                    }
                }

            }
        }
        // Odd
        else{
            for (int i = 0; i < (length/2) - 1; i++){
                for (int j = 0; j < length; j++){
                    if (j == (j + i) || j == (i - j)){
                        sum += mat[i][j];
                    }
                }
            }
            sum += mat[(length/2) - 1][(length/2) - 1];
            for (int i = length - 1; i > (length/2) - 1; i--){
                for (int j = 0; j < length; j++){
                    if (j == (i - j) || j == (i - 1)){
                        sum += mat[i][j];
                    }
                }

            }
        }








        return sum;
    }
}