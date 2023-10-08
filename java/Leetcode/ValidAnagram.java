public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "aaargmn"));
        System.out.println(isAnagram("car", "bat"));
    }

    public static boolean isAnagram(String s, String t) {
        int length = s.length();
        Character[] string1 = new Character[length];
        Character[] string2 = new Character[length];

        if (s.length() != t.length()){
            return false;
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
