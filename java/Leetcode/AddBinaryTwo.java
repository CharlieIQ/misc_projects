public class AddBinaryTwo {
    public static void main(String[] args){
        System.out.println(addBinary("1111", "00110"));
    }

    public static String addBinary(String a, String b) {
        int length = Math.max(a.length(), b.length());

        if (a.charAt(0) =='1' && b.charAt(0) == '1'){
            length++;
        }

        return intToBinary(convertToInt(a) + convertToInt(b) + 1, length);
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

    public static String intToBinary(int num, int length){
        String binary = "";
        for (int i = length - 1; i >= 0; i--){
            if (num - Math.pow(2, i) > 0){
                num -= Math.pow(2, i);
                binary += "1";
            }
            else{
                binary += "0";
            }
        }
        return binary;
    }

}
