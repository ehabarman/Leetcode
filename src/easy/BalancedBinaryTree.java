package easy;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) == -1? false : true;
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        if( left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;

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
