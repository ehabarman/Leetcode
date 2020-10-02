package medium;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        int j;
        for (int i = T.length - 2; i >= 0; i--) {
            j = i + 1;
            while (T[i] >= T[j] && ans[j] != 0) {
                j += ans[j];
            }
            ans[i] = T[i] >= T[j] ? 0 : j - i;
        }
        return ans;
    }

}
