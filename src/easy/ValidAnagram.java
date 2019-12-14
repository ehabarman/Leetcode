package easy;

public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("a","b"));
    }
    public static boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;

        int[] count = new int [256];

        int len = s.length();
        for(int i = 0; i < len; i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++)
            if(count[i] != 0)
                return false;
        return true;
    }
}
