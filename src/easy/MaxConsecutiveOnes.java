package easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for( int n : nums)
            if( n == 1)
                current++;
            else{
                max = Math.max(max, current);
                current = 0;
            }
        return Math.max(max, current);
    }
}
