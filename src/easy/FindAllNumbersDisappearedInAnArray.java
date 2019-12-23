package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        int temp, i = 0;
        while (i < nums.length) {
            if ((nums[i] != i + 1) && (nums[i] != nums[nums[i] - 1])) {
                temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else
                i++;
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                missing.add(i + 1);
        }
        return missing;
    }
}
