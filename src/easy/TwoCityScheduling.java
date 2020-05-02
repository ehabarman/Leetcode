package easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> (a[1] - a[0])));
        int count = 0;
        int total = 0;
        for(int[] pair:costs){
            q.offer(pair);
        }
        while(q.size()>0){
            int[] pair = q.poll();
            if(count<costs.length/2){
                total+=pair[1];
            }else{
                total+=pair[0];
            }
            count++;
        }
        return total;
    }
}
