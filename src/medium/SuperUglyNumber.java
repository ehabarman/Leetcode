package medium;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] arr = new int[n];
        int primesLen = primes.length;
        int[] primesIndexes = new int[primesLen];
        arr[0] = 1;
        int num;
        for (int i = 1; i < n ;i++) {
            arr[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primesLen; j++) {
                num = arr[primesIndexes[j]] * primes[j];
                if (num < arr[i]) {
                    arr[i] = num;
                }
            }
            for (int j = 0; j < primesLen; j++) {
                num = arr[primesIndexes[j]] * primes[j];
                if (num == arr[i]) {
                    primesIndexes[j]++;
                }
            }
        }
        return arr[n-1];
    }
}
