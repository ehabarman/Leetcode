package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				threeSum(nums, i + 1, target - nums[i], ans);
			}
		}
		return ans;
	}

	private void threeSum(int[] nums, int start, int threeTarget, List<List<Integer>> ans) {
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		for (int i = start; i < nums.length - 2; i++) {
			if (i == start || nums[i] != nums[i - 1]) {
				int left = i + 1, right = nums.length - 1, target = threeTarget - nums[i];
				while (left < right) {
					if (nums[left] + nums[right] == target) {
						temp.add(Arrays.asList(nums[start - 1], nums[i], nums[left], nums[right]));
						while (left < right && nums[left + 1] == nums[left]) left++;
						while (left < right && nums[right - 1] == nums[right]) right--;
						left++;
						right--;
					} else if (nums[left] + nums[right] < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		ans.addAll(temp);
	}
}
