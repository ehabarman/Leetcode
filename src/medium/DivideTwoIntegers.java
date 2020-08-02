package medium;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if (divisor == -1) return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        if (dividend == divisor) return 1;
        int d2 = (divisor > 0) ? divisor : -divisor;
        int d1 = dividend, sol = 0;
        if (d1 < 0) {
            if (d1 == Integer.MIN_VALUE) {
                d1 = -d1 + d2;
                sol++;
            }
            d1 = -d1;
        }
        for (int x = 31; x >= 0; x--) {
            if ((d1 >>> x) - d2 >= 0) {
                sol += 1 << x;
                d1 -= d2 << x;
            }
        }
        return (dividend > 0) == (divisor > 0) ? sol : -sol;
    }
}
