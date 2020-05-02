package hard;

import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        int total = 0;
        int max = 0;
        Arrays.sort(satisfaction);
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            int temp = total + max + satisfaction[i];
            if (temp < max) break;
            total += satisfaction[i];
            max = temp;
        }
        return max;
    }
}
