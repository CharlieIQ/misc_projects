public class AddBinary {
    // NOT DONE
    public static void main(String[] args){
        String a1 = "11";
        String b1 = "1";
        String a2 = "101";
        String b2 = "1";

        System.out.println(addBinary(a1, b1));
        System.out.println(addBinary(a2, b2));
}

    public static int convertBinaryToInt(String biNum){
        int len = biNum.length();
        int num = 0;

        for (int i = 0; i < len; i++){
            if (biNum.charAt(i) == '1'){
                num += Math.pow(2, i);
            }
        }
        return num;
    }

    public static String addBinary(String a, String b) {
        int decimalValue = convertBinaryToInt(a) + convertBinaryToInt(b);
        System.out.println(decimalValue);
        int length = Math.max(a.length(), b.length()) + 1;
        String addedValues = String.valueOf(decimalValue);
        String newNum = "";
        double remain;
        while (length > 0){
            System.out.println(length);
            remain = Math.pow(2, length);
            System.out.println(remain);
            if (remain < (remain - Math.pow(2, length - 1))){
                newNum += '0';
            }
            else{
                newNum += '1';
            }
            length--;
            decimalValue -= remain;
        }

        return newNum;
    }
}
