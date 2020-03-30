package easy;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[]{1, n - 1};
        while (String.valueOf(res[0]).contains("0") || String.valueOf(res[1]).contains("0")) {
            res[0]++;
            res[1]--;
        }
        return res;
    }
}
