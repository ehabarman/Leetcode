package easy;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        if(nums.length == 0)
            return new int[0];
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
            result[i] = nums[i] + result[i-1];

        return result;
    }
}
