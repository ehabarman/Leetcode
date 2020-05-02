package easy;

import java.util.HashMap;

public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0, d;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                d = distance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int v : map.values())
                if (v > 0) res += v * (v - 1);
            map.clear();
        }
        return res;
    }

    public int distance(int[] a, int[] b) {
        int x = a[0] - b[0], y = a[1] - b[1];
        return x * x + y * y;
    }
}
