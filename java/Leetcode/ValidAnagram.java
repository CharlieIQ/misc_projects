public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "aaargmn"));
        System.out.println(isAnagram("car", "bat"));
    }

    public static boolean isAnagram(String s, String t) {
        // Get a variable for length
        int length = s.length();
        // Create 2 character lists
        Character[] string1 = new Character[length];
        Character[] string2 = new Character[length];
        // Early return for edge case that the 2 strings aren't equal
        if (s.length() != t.length()){
            return false;
        }
        // Fill in each list
        for (int i = 0; i < length; i++){
            string1[i] = s.charAt(i);
            string2[i] = t.charAt(i);
        }
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (string1[i] != string2[j]){
                    return false;
                }
                else{
                    string2[j] = '-';
                    string1[i] = '!';

                }
            }
        }

        return true;
    }


}
