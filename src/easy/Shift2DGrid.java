package easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int gridSize = m * n;
        int counter = 0;
        int beginIndex = 0;

        if (k != 0) {
            while (counter < gridSize) {
                int currentIndex = beginIndex;
                int value = grid[currentIndex / n][currentIndex % n];
                do {
                    currentIndex += k;
                    currentIndex %= gridSize;
                    int tmp = grid[currentIndex / n][currentIndex % n];
                    grid[currentIndex / n][currentIndex % n] = value;
                    value = tmp;
                    counter++;
                } while (currentIndex != beginIndex);
                beginIndex++;

            }
        }
        List<List<Integer>> result = new ArrayList<>(m);
        for (int[] line : grid) {
            List<Integer> lineList = new ArrayList<>(n);
            for (int val : line) {
                lineList.add(val);
            }
            result.add(lineList);
        }
        return result;
    }
}
