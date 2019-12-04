package easy;

import java.util.Scanner;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] indices = new int[s.nextInt()][2];

        for (byte i = 0; i < indices.length; i++) {
            indices[i][0] = s.nextInt();
            indices[i][1] = s.nextInt();
        }

        System.out.println(oddCells(n, m, indices));

    }

    public static int oddCells(int n, int m, int[][] indices) {
        byte[] rows = new byte[n];
        byte[] cols = new byte[m];
        short [] rowCount = new short[2];
        short [] colCount = new short[2];

        for (byte i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }

        for (byte i = 0; i < rows.length; i++)
            rowCount[rows[i]%2]++;
        for (byte i = 0; i < cols.length; i++)
            colCount[cols[i]%2]++;

        return rowCount[0] * colCount[1] + rowCount[1] * colCount[0];
    }
}
