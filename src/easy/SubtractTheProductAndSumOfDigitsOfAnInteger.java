package easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int d;
        while (n > 0){
            d = n % 10;
            n /= 10;
            product *= d;
            sum += d;
        }
        return product - sum;
    }
}
