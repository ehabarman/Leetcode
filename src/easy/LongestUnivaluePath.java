package easy;

public class LongestUnivaluePath {
    int max = 1;

    public int longestUnivaluePath(TreeNode root) {
        if (root != null)
            rec(root, root.val);
        return max - 1;
    }

    public int rec(TreeNode root, int parent) {
        if (root == null) return 0;
        int left = rec(root.left, root.val);
        int right = rec(root.right, root.val);
        max = Math.max(max, left + right + (root.left == null && root.right == null ? 0 : 1));
        return root.val == parent ? Math.max(left, right) + 1 : 0;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
