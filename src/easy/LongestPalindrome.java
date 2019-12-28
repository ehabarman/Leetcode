package easy;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] map = new char[256];
        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i)]++;
        boolean single = false;
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                if (map[i] % 2 == 0) count += map[i];
                else {
                    count += map[i] - 1;
                    single = true;
                }
            }
        }
        return single ? count + 1 : count;
    }
}
