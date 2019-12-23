package easy;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        switch (cost.length) {
            case 0:
                return 0;
            case 1:
                return cost[0];
            case 2:
                return Math.min(cost[0], cost[1]);
            default:
                int[] min = new int[cost.length];
                min[0] = cost[0];
                min[1] = cost[1];
                for (int i = 2; i < cost.length; i++)
                    min[i] = cost[i] + Math.min(min[i - 1], min[i - 2]);

                return Math.min(min[min.length-1],min[min.length-2]);
        }

    }
}
