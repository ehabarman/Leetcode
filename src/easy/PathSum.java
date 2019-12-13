package easy;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)
            return false;
        if ((root.val == sum)&&(root.left == null)&&(root.right == null))
            return true;

        boolean left = hasPathSum(root.left, (sum - root.val));
        boolean right = hasPathSum(root.right, (sum - root.val));

        return left || right ? true : false;
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
