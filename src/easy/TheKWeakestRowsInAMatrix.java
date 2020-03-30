package easy;

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0])
                return o1[1] - o2[1];
            return o1[0] - o2[0];
        });
        for (int i = 0; i < mat.length; i++) {
            int total = 0;
            for (int j : mat[i]) {
                total += j;
            }
            pq.add(new int[]{total, i});
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = pq.poll()[1];

        return result;
    }
}
