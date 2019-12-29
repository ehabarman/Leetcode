package easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i, j = 0;
        int n = s.length(), m = t.length();
        if (n == 0 || m == 0) return n == m ? true : n == 0;
        for (i = 0; i < m; i++)
            if (s.charAt(j) == t.charAt(i) && ++j == n)
                return true;
        return false;
    }
}
