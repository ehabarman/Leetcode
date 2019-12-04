package easy;

import java.util.Scanner;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = s.nextInt();

        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {

        int init, i, j, temp;
        for (i = matrix.length - 1; i >= 0; i--) {
            temp = i;
            j = 0;
            init = matrix[temp][j];

            while (temp < matrix.length && j < matrix[0].length) {
                if (matrix[temp][j] != init)
                    return false;
                temp++;
                j++;
            }
        }

        for (i = 1; i < matrix[0].length;i++){
            j = 0;
            temp = i;
            init = matrix[j][i];

            while (temp < matrix[0].length && j < matrix.length) {
                if (matrix[j][temp] != init)
                    return false;
                temp++;
                j++;
            }
        }

        return true;
    }
}
