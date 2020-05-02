package medium;

import common.TreeNode;

public class DeepestLeavesSum {

    int DEEPEST_LEVEL = 0;
    int SUM = 1;

    public int deepestLeavesSum(TreeNode root) {
        int[] dp = {0, 0};
        helper(root, dp, 1);
        return dp[SUM];
    }

    public void helper(TreeNode root, int[] dp, int level){
        if(root == null) return;
        if(level == dp[DEEPEST_LEVEL]) dp[SUM] += root.val;
        if(level > dp[DEEPEST_LEVEL]) dp[SUM] = root.val;
        dp[DEEPEST_LEVEL] = Math.max(dp[DEEPEST_LEVEL], level);
        helper(root.left, dp, level + 1);
        helper(root.right, dp, level + 1);
    }
}
