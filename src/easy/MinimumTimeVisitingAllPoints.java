package easy;

public class MinimumTimeVisitingAllPoints {
    public static int diff(int x1, int x2, int y1, int y2) {
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        return a > b ? a : b;
    }

    public int minTimeToVisitAllPoints(int[][] p) {
        int totalTime = 0;
        for (int i = 0; i < p.length - 1; i++) {
            totalTime += diff(p[i][0], p[i + 1][0], p[i][1], p[i + 1][1]);
        }
        return totalTime;
    }
}
