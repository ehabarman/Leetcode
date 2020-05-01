package medium;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        int size = points.length;
        PriorityQueue<Point> pq = new PriorityQueue<>((o1, o2) -> o2.dist - o1.dist);
        for (int i = 0; i < size; i++) {
            pq.offer(new Point(points[i][0], points[i][1]));
            if (pq.size() > K) pq.poll();
        }
        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            Point point = pq.poll();
            ans[i] = point.getPoint();
        }
        return ans;
    }

    class Point {
        int x, y, dist;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }

        public int[] getPoint() {
            return new int[]{x, y};
        }
    }
}
