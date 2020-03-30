package easy;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int i;
        int sum = 0;

        for (i = 0; i < k; i++)
            sum += nums[i];
        int max = sum;

        for (; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }
        return max / (double) k;
    }
}
