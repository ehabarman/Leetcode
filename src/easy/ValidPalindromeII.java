package easy;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int len = s.length() / 2;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - i - 1;
                return (isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1));
            }
        }
        return true;
    }

    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i))
                return false;
        }
        return true;
    }


}
