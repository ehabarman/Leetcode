package easy;

import common.TreeNode;

public class BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        if (root == null)
            return 0;
        int curVal = 0;
        curVal = Math.abs(sumSubTree(root.left) - sumSubTree(root.right));
        return curVal + findTilt(root.left) + findTilt(root.right);
    }

    public int sumSubTree(TreeNode root) {
        return root == null ? 0 : root.val + sumSubTree(root.left) + sumSubTree(root.right);
    }
}
