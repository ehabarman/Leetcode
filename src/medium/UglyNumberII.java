package medium;

public class UglyNumberII {

    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < n ;i++) {
            int num2 = arr[index2] * 2;
            int num3 = arr[index3] * 3;
            int num5 = arr[index5] * 5;
            arr[i] = Math.min(num2, num3);
            arr[i] = Math.min(arr[i], num5);
            if (arr[i] == num2) index2++;
            if (arr[i] == num3) index3++;
            if (arr[i] == num5) index5++;
        }
        return arr[n-1];
    }
}
