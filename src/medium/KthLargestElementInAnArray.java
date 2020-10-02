package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());
        for(int num : nums) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}
