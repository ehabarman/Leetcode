package easy;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] t = {0, 1, 1};
        if(n < 3) return t[n];
        int temp;
        for(int i = 3; i <= n; i++){
            temp = t[0] + t[1] + t[2];
            t[0] = t[1];
            t[1] = t[2];
            t[2] = temp;
        }
        return t[2];
    }
}
