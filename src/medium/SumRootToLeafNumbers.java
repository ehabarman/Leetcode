package medium;

import common.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper (TreeNode root, int sum){
        if (root == null) return 0;
        if(root.left == root.right) return sum + root.val;
        sum = sum + root.val;
        sum *= 10;
        return helper(root.left, sum) + helper(root.right, sum);
    }
}
