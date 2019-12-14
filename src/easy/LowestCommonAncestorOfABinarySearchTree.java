package easy;

public class LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root.val == p.val || root.val == q.val)
            return root;

        if( p.val > root.val && q.val < root.val )
            return root;

        if( p.val < root.val && q.val > root.val )
            return root;

        if( p.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return lowestCommonAncestor(root.left, p, q);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
