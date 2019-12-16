package easy;

public class FibonacciNumber {
    public int fib(int N) {
        int a = 1, b = 2;
        int temp;

        if (N <= 2)
            return N;

        N -= 2;
        while (N-- > 0) {
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
