package easy;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAStream {
    Queue<Integer> queue;
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }
    }

    public int add(int val) {
        queue.add(val);
        if (queue.size() == k + 1) {
            queue.poll();
        }
        return queue.peek();
    }
}
