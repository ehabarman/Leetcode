package easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            pq.add(nums[i]);
        }

        int size = pq.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) res[map.get(pq.poll())] = "Gold Medal";
            else if (i == 1) res[map.get(pq.poll())] = "Silver Medal";
            else if (i == 2) res[map.get(pq.poll())] = "Bronze Medal";
            else res[map.get(pq.poll())] = Integer.toString(i + 1);
        }

        return res;
    }
}
