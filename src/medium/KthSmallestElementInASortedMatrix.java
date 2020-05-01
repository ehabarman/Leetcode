package medium;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int i = matrix[0][0];
        int j = matrix[n - 1][n - 1];
        while (i < j) {
            int mid = (i + j) >> 1;
            int count = getCount(matrix, mid, n);
            if (count >= k) j = mid;
            else i = mid + 1;
        }
        return j;
    }

    public int getCount(int[][] matrix, int tgt, int n) {
        int i = n - 1, j = 0, res = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > tgt)
                i--;
            else {
                res += i + 1;
                j++;
            }
        }
        return res;
    }
}