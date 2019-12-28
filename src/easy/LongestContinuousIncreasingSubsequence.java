package easy;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 0)
            return 1;
        int max = 0;
        int count = 1;
        for(int i =0; i < nums.length-1; i++){
            if( nums[i] < nums[i+1])
                count++;
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
