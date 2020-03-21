package easy;

import common.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode r) {
        return dfs(r, r.val);
    }

    boolean dfs(TreeNode r, int v) {
        return r == null || (r.val == v && dfs(r.left, v) && dfs(r.right, v));
    }


}
