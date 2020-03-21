package easy;

public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        int sum = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        int num, index;
        for (int i = 0; i < n; i++) {
            num = queries[i][0];
            index = queries[i][1];
            sum -= A[index] % 2 == 0 ? A[index] : 0;
            A[index] += num;
            sum += (A[index] % 2) == 0 ? A[index] : 0;
            result[i] = sum;
        }
        return result;
    }
}
