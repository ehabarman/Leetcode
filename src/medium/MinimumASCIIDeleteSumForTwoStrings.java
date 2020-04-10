package medium;

public class MinimumASCIIDeleteSumForTwoStrings {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = 0; i < s1.length(); i++ ) dp[i+1][0] = dp[i][0] + s1.codePointAt(i);
        for(int i = 0; i < s2.length(); i++ ) dp[0][i+1] = dp[0][i] + s2.codePointAt(i);
        for(int i = 1; i <= s1.length(); i++)
            for(int j = 1; j <= s2.length(); j++)
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int left = dp[i][j-1] + s2.codePointAt(i-1);
                    int top = dp[i-1][j] + s1.codePointAt(j-1);
                    dp[i][j] = Math.min(left,top);
                }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args){
        String s = "sea";
        System.out.print(s.codePointAt(2));
    }
}
