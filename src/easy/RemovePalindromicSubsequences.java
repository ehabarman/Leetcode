package easy;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        if(isPalindrome(s)) return 1;
        return 2;
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (end > start)
            if(s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }
}
