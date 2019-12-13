package easy;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecursion(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTRecursion(int[] nums, int start, int end) {
        if (end - start + 1 == 0) return null;
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTRecursion(nums, start, mid - 1);
        root.right = sortedArrayToBSTRecursion(nums, mid + 1, end);
        return root;
    }

    /**
     * def sortedArrayToBST(self, nums: List[int]) -> TreeNode:
     *         if len(nums) == 0:
     *             return None
     *         mid = (len(nums)-1)//2
     *         root = TreeNode(nums[mid])
     *         root.left = self.sortedArrayToBST(nums[:mid])
     *         root.right = self.sortedArrayToBST(nums[mid+1:])
     *         return root
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
