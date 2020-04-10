package medium;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        if (len == 1) return A[0][0];
        int left, right;
        for(int i = len - 2; i >= 0; i--){
            for(int j = 0; j < len; j++){
                left = j - 1 < 0? Integer.MAX_VALUE : A[i + 1][j - 1];
                right = j + 1 >= len ? Integer.MAX_VALUE : A[i + 1][j + 1];
                A[i][j] += Math.min(Math.min(A[i+1][j], left), right);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            min = Math.min(min, A[0][i]);
        }

        return min;
    }
}
