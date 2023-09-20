public class Main {
    // So close
    public static void main(String[] args){
        System.out.println(isPalindrome(123123));
        System.out.println(isPalindrome(1000000001));
    }

    public static boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String numToString = String.valueOf(x);
        int numLength = numToString.length();
        // For if length is 1
        if (numLength == 1){
            return true;
        }
        // For length equal to 2
        else if (numLength == 2){
            if (numToString.charAt(0) == numToString.charAt(1)){
                return true;
            }
        }
        else{

            // If word length is even
            if (numLength % 2 == 0){
                for (int i = 0; i < numLength/2; i++){
                    if (numToString.charAt(i) == numToString.charAt((numLength - 1) - i)){
                        isPalindrome = true;
                    }
                    else{
                        return false;
                    }
                }
            }
            // If word length is odd
            else {
                for (int i = 0; i < (int)numLength/2; i++){
                    if (numToString.charAt(i) == numToString.charAt((numLength - 1) - i)){
                        isPalindrome = true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }


        return isPalindrome;
    }
}
