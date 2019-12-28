package easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
