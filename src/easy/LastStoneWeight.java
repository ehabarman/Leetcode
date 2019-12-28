package easy;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
        for (int stone : stones)
            maxheap.add(-stone);

        while (maxheap.size() > 1) {
            int temp = maxheap.remove() - maxheap.remove();
            if (temp != 0)
                maxheap.add(-Math.abs(temp));
        }
        return maxheap.size() == 0 ? 0 : -maxheap.remove();
    }
}
