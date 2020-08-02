package medium;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) return false;
        Map<Long, Long> bucket = new HashMap<>();
        int w = t + 1;
        for (int i = 0; i < nums.length; i++) {
            long bucketId = getId(nums[i], w);
            if (bucket.containsKey(bucketId)) {
                return true;
            }
            if (bucket.containsKey(bucketId - 1) && nums[i] - bucket.get(bucketId - 1) <= t) {
                return true;
            }
            if (bucket.containsKey(bucketId + 1) && bucket.get(bucketId + 1) - nums[i] <= t) {
                return true;
            }
            bucket.put(bucketId, (long) nums[i]);
            if (i >= k) bucket.remove(getId(nums[i - k], w));
        }

        return false;
    }

    private long getId(int num, int w) {
        if (num >= 0) {
            return num / w;
        } else {
            return (num + 1) / w - 1;
        }
    }
}
