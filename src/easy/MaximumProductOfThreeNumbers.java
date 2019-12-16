package easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] == 0)
            return 0;
        else if (nums[len - 1] < 0)
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        else
            return  Math.max( nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
    }
}
