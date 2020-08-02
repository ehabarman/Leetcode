package medium;

public class SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] count = new int[101];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                count[mat[i][j]]++;
        int index = 0, x = 0, y = 0;
        int n = row * col;
        while ( x * y < n ) {
            for (int j = y; j < col; j++)
                while (index <= 100) {
                    if (count[index] != 0) {
                        mat[x][j] = index;
                        count[index]--;
                        break;
                    } else {
                        index++;
                    }
                }
            x++;
            for (int i = x; i < row; i++)
                while (index <= 100) {
                    if (count[index] != 0) {
                        mat[x][y] = index;
                        count[index]--;
                        break;
                    } else {
                        index++;
                    }
                }
            y++;
        }

        return mat;
    }
}
