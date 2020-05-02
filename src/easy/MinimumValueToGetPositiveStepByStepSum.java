package easy;

public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int solution = 0;
        int total = 0;
        for(int num : nums){
            total += num;
            if(total < 1){
                solution += 1 - total;
                total = 1;
            }
        }
        return solution != 0 ? solution : 1;
    }
}
