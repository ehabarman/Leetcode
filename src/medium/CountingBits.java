package medium;

public class CountingBits {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ans[i] = i%2 == 1 ? ans[i-1] + 1 : ans[i/2];
        }
        return ans;
    }
}
