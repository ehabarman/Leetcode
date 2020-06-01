package medium;

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {
        if (A.length == 0) return 0;
        int i, N = A.length;
        int minSum = 0, maxSum = 0, sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (i = 0; i < N; i++) {
            sum = sum + A[i];
            if (minSum > 0) minSum = A[i];
            else minSum = minSum + A[i];

            if (maxSum < 0) maxSum = A[i];
            else maxSum = maxSum + A[i];

            if (minSum < min) min = minSum;
            if (maxSum > max) max = maxSum;
        }
        return max < 0 ? max : Math.max(max, sum - min);
    }
}
