package easy;

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        return n >= 5? n/5 + trailingZeroes(n/5) : 0;
    }

}
