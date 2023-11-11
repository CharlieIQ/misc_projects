public class LargestAltitude {
    public static void main(String[] args){
        int[] testCaseOne = {-1, 2, 3, 4, 5, 9};

        System.out.println(largestAltitude(testCaseOne));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int length = gain.length;
        int netGain = 0;

        if (length == 1){
            if (gain[0] > 0){
                return gain[0];
            }
            return 0;
        }

        for (int i = 0; i < length; i++){
            netGain += gain[i];
            if (netGain > max){
                max = netGain;
            }
        }

        return max;
    }
}
