/**
 * This class will search if a word exists in another string
 * Notes:
 * - Loop iteration will terminate if word is found
 * - Search will have to be in order to avoid word split apart
 */

public class IndexOfFirstOccurrence {
    // WORKS
    public static void main(String[] args){
        System.out.println(strStr("badsadbutsad", "sad")); // 3
        System.out.println(strStr("leetcode", "leeto")); // -1
        System.out.println(strStr("leetcode", "e")); // 1
        System.out.println(strStr("leetcode", "code")); // 4
        System.out.println(strStr("charlie", "rli")); // 3
        System.out.println(strStr("charlie", "charli")); // 0
        System.out.println(strStr("leetcode", "leetcode")); // 0
    }

    public static int strStr(String haystack, String needle) {
        Character[] haystackChars = new Character[haystack.length()];
        Character[] needleChars = new Character[needle.length()];
        int indexOfWord = -1;
        // Write characters in haystack chars
        for (int i = 0; i < haystackChars.length; i++){
            haystackChars[i] = haystack.charAt(i);
        }
        // Write characters in needle chars
        for (int i = 0; i < needleChars.length; i++){
            needleChars[i] = needle.charAt(i);
        }
        // For if needle is length 1
        if (needle.length() == 1){
            for (int i = 0; i < haystackChars.length; i++){
                if (needleChars[0] == haystackChars[i]){
                    return i;
                }
            }
        }
        // Iterate over haystack
        for (int i = 0; i < (haystackChars.length - needleChars.length) + 1; i++){
            // Iterate over the characters in needle
            for (int j = 0; j < needleChars.length; j++){
                // Checks if all the characters in needle match the next few inputs in haystack
                if (needleChars[j].equals(haystackChars[i+j])){

                    if (j == needleChars.length - 1){
                        return i;
                    }
                }
                else{

                    break;
                }
            }

        }

        return indexOfWord;
    }

}
