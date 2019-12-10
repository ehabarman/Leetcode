package easy;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
