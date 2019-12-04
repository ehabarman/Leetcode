package easy;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), c = s.nextInt();
        int[][] arr = new int[r][c];
        for (short i = 0; i < r; i++)
            for (short j = 0; j < c; j++)
                arr[i][j] = s.nextInt();

        int[][] trans = transpose(arr);

        for (short i = 0; i < c; i++)
        {
            for (short j = 0; j < r; j++)
                System.out.print(trans[i][j]+" ");
            System.out.println();
        }


    }

    public static int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (short i = 0; i < A.length; i++)
            for (short j = 0; j < A[0].length; j++)
                T[j][i] = A[i][j];
        return T;
    }
}
