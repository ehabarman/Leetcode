package easy;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode r) {
        return dfs(r, r.val);
    }

    boolean dfs(TreeNode r, int v) {
        return r == null || (r.val == v && dfs(r.left, v) && dfs(r.right, v));
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
