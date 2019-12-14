package easy;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int[] total = new int[nums.length];
        total[0] = nums[0];
        total[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            total[i] = nums[i] + total[i-2] > total[i-1] ? nums[i] + total[i-2]: total[i-1];
        }

        return total[nums.length - 1];
    }
}
