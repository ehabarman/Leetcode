package easy;

public class PrimeArrangements {
    public int numPrimeArrangements(int n) {
        int countPrimes = countPrimes(n);
        int mod = 1000000007;
        long result = 1;
        for(int i = 2; i <= countPrimes; i++) result = (result % mod) * i;
        for(int i = 2; i <= n - countPrimes; i++) result = (result % mod) * i;
        return (int)(result % mod);
    }

    public int countPrimes(int n) {
        boolean [] numbers = new boolean[n+1];
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(numbers[i]) continue;
            count++;
            int j = i + i;
            while (j <= n) {
                numbers[j] = true;
                j += i;
            }
        }
        return count;
    }
}
