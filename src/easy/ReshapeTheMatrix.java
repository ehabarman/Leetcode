package easy;

import java.util.Scanner;

public class ReshapeTheMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = s.nextInt();

        int[][] result = matrixReshape(matrix, r, c);
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        if(n * m != r * c) return nums;
        int reshapedI = 0;
        int reshapedJ = 0;
        int[][] result = new int[r][c];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[reshapedI][reshapedJ++] = nums[i][j];
                if(reshapedJ != c) continue;
                reshapedJ = 0;
                reshapedI++;
            }
        }

        return result;
    }
}
