public class FindTheDifference {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        // Output should be e
        System.out.println(findDifference(s, t));
    }

    public static char findDifference(String s, String t){
        int originalLen = s.length();
        int newLen = originalLen + 1;
        Character[] originalString = new Character[originalLen];
        Character[] newString = new Character[newLen];

        // Add original string
        for (int i = 0; i < originalLen; i++){
            originalString[i] = s.charAt(i);
        }
        // For shortened string
        for (int i = 0; i < originalLen; i++){
            newString[i] = t.charAt(i);
        }
        int indexOfDeletedElement = 0;
        // For deletion
        for (int i = newLen - 1; i >= 1; i--){
            for (int j = 0; j < originalLen; j++){
                if (originalString[j].equals(newString[i])) {
                    newString[i] = null;
                    indexOfDeletedElement = i;
                    break;
                }
            }

            newString = shortenArray(orderArray(originalString, indexOfDeletedElement));
        }







        return newString[0];
    }

    public static Character[] orderArray(Character[] testArray, int indexOfDeletion){

        for (int i = indexOfDeletion; i < testArray.length - 1; i++){
            testArray[i] = testArray[i+1];
        }

        return testArray;
    }

    public static Character[] shortenArray(Character[] testArray){
        Character[] shortenedArray = new Character[testArray.length - 1];

        for (int i = 0; i < shortenedArray.length; i++){
            shortenedArray[i] = testArray[i];
        }
        return shortenedArray;
    }

}
