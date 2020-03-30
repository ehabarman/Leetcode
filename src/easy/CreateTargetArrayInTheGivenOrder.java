package easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        int[] arr = targetList.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
