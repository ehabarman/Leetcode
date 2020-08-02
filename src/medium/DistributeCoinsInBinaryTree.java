package medium;

import common.TreeNode;

public class DistributeCoinsInBinaryTree {

    int ans;

    public int distributeCoins(TreeNode root) {
       ans = 0;
        dfsSolution(root);
        return ans;
    }

    private int dfsSolution(TreeNode root) {
        if (root == null) return 0;
        int L = dfsSolution(root.left);
        int R = dfsSolution(root.right);
        ans += Math.abs(L) + Math.abs(R);
        return root.val + L + R - 1;
    }
}
