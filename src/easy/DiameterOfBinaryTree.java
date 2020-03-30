package easy;

import common.TreeNode;

public class DiameterOfBinaryTree {
    public static int localWidth = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        localWidth = 0;
        helper(root);
        return localWidth;
    }

    public static int helper(TreeNode root) {
        if(root == null)
            return 0;

        if(root.left == root.right)
            return 1;

        int left = helper(root.left);
        int right = helper(root.right);

        localWidth = Math.max(localWidth, left + right);
        return Math.max(left,right) + 1;
    }
}
