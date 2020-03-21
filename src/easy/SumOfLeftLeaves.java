package easy;

import common.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null)
            return sum;
        if (root.left != null && root.left.left == root.left.right)
            sum += root.left.val;
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }



}
