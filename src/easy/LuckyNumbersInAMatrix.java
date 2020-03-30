package easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isMin(matrix[i][j], matrix, i) && isMax(matrix[i][j], matrix, j)) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }

    private boolean isMax(int ele, int[][] matrix, int j) {
        int row = 0;
        while (row < matrix.length) {
            if (ele < matrix[row++][j]) {
                return false;
            }
        }
        return true;
    }

    private boolean isMin(int ele, int[][] matrix, int i) {
        int col = 0;
        while (col < matrix[i].length) {
            if (ele > matrix[i][col++]) {
                return false;
            }
        }
        return true;
    }
}
