package easy;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;
        int pivot = -1;
        for(int i = 0; i < nums.length; i++) total += nums[i];
        for(int i =0 ; i < nums.length; i++)
            if(left == total - left - nums[i]) return i;
            else left += nums[i];
        return pivot;
    }
}
