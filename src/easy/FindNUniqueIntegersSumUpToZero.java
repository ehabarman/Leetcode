package easy;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            arr[i] = i + 1;
            arr[i + 1] = -arr[i];
        }
        if (n % 2 == 1) {
            arr[arr.length-1] = 0;
        }
        return arr;
    }
}
