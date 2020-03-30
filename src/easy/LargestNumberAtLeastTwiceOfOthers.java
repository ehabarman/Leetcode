package easy;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1)
            return 0;

        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        int index1 = max1 == nums[0] ? 0 : 1;
        int index2, temp;

        for(int i = 2; i < nums.length; i++){
            if( max2 < nums[i]){
                index2 = i;
                max2 = nums[i];
                if(max1 < max2){
                    temp = max1;
                    max1 = max2;
                    max2 = temp;
                    index1 = index2;
                }
            }
        }

        return max1 >= max2 * 2 ? index1 : -1;
    }
}
