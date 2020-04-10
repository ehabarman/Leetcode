package hard;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        char[] sa = new char[s.length() + 1];
        char[] pa = new char[p.length() + 1];
        for (int i = 0; i < s.length(); i++) sa[i + 1] = s.charAt(i);
        for (int i = 0; i < p.length(); i++) pa[i + 1] = p.charAt(i);

        boolean[][] dp = new boolean[sa.length][pa.length];
        dp[0][0] = true;
        for (int i = 2; i < pa.length; i++) {
            if (pa[i] == '*') dp[0][i] = dp[0][i - 2];
        }

        for (int i = 1; i < sa.length; i++) {
            char sc = sa[i];
            for (int j = 1; j < pa.length; j++) {
                char pc = pa[j];
                if (pc == sc || pc == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    if (pa[j - 1] != sc && pa[j - 1] != '.') {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j - 2] || dp[i - 1][j];
                    }
                }
            }
        }
        return dp[sa.length - 1][pa.length - 1];
    }
}
