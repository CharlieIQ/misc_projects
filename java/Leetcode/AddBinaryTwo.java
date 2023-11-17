public class AddBinaryTwo {
    public static void main(String args){

    }


    public static String addBinary(String a, String b) {
        return intToBinary(convertToInt(a) + convertToInt(b));
    }

    public static int convertToInt(String binaryString){
        int newInt = 0;
        for (int i = 0; i < binaryString.length() ; i++){
            if (binaryString.charAt(i) == '1'){
                newInt += Math.pow(2, binaryString.length() - i - 1);
            }
        }

        return newInt;
    }

    public static String intToBinary(int num){
        String binary = "";

        return binary;
    }

}
