public class DivisibleAndNonDivisibleSums {
    public static void main(String[] args){
        System.out.println(differenceOfSums(45, 3));
    }
    public static int differenceOfSums(int n, int m) {
        int sumOfDivisible = 0;
        int sumOfNonDivisible = 0;

        for (int i = 1; i < n+1; i++){
            if (i % m == 0){
                sumOfDivisible += i;
            }else{
                sumOfNonDivisible += i;
            }
        }

        return sumOfNonDivisible - sumOfDivisible;
    }
}
