package medium;

public class DecodeWays {

	public int numDecodings(String s) {
		int length = s.length();
		int[] dp = new int[length + 1];

		dp[length] = 1;
		if (s.charAt(length - 1) != '0') {
			dp[length - 1] = 1;
		}
		for (int i = length - 2; i >= 0; i--) {
			int curr = s.charAt(i)- '0';
			int after = s.charAt(i + 1)- '0';
			if (curr == 0) {
				dp[i] = 0;
			} else if (curr > 2 || (curr == 2 && after > 6)) {
				dp[i] = dp[i + 1];
			} else {
				dp[i] = dp[i + 1] + dp[i + 2];
			}
		}
		return dp[0];
	}
	
}
