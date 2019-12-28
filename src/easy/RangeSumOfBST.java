package easy;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        int sum = rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        return root.val >= L && root.val <= R? sum + root.val : sum;
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
