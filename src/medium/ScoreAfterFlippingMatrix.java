package medium;

public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int R = A.length, C = A[0].length;
        int ans = 0;
        for (int c = 0; c < C; ++c) {
            int ones = 0;
            for (int r = 0; r < R; ++r)
                ones += A[r][c] ^ ((A[r][0] + 1) %2);
            ans += Math.max(ones, R - ones) * (1 << (C-1-c));
        }
        return ans;
    }

}
