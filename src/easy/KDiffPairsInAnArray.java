package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 1));
        int count = 0;
        if (k == 0) {
            for (int num : map.keySet())
                if (map.get(num) > 1) count++;
        } else {
            Set<Integer> seen = new HashSet<>();
            for (int num : map.keySet()) {
                if (map.containsKey(num + k) && !seen.contains(num + k)) count++;
                if (map.containsKey(num - k) && !seen.contains(num - k)) count++;
                seen.add(num);
            }
        }
        return count;
    }
}
