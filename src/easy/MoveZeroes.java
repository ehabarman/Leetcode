package easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0, temp;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != 0){
                temp = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex++] =  nums[i];
                nums[i] = temp;
            }
    }
}
