package easy;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        double digits;
        for(int num : nums){
            digits = Math.log10(num);
            count += (int) digits == digits ? (((int)digits + 1) % 2) ^ 1 : (((int)Math.ceil(digits)) % 2) ^ 1;
        }
        return count;
    }
}
