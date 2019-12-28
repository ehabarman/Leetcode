package easy;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int carry = (a&b)<<1;
        int sum = a^b;
        if(carry == 0)
            return sum;
        return getSum(carry,sum);
    }
}
