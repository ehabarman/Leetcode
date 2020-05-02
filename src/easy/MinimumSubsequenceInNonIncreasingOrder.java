package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int totalSum = Arrays.stream(nums).sum();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1 ; i >= 0; i--)
            if(sum > totalSum - sum)
                break;
            else {
                sum += nums[i];
                list.add(nums[i]);
            }
        return list;
    }
}
