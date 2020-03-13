package easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int[][] ret = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i].length - 1; j >= 0; j--) {
                ret[i][A[i].length - 1 - j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return ret;
    }
}
