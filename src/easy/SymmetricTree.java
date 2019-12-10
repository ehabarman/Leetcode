package easy;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right != null) return false;
        if (root.right == null && root.left != null) return false;
        return isSymmetricRecursive(root.left, root.right);
    }

    public static boolean isSymmetricRecursive(TreeNode left, TreeNode right){

        if(left==null && right==null) return true;
        if(right.left==null && left.right!=null) return false;
        if(right.right==null && left.left!=null) return false;
        if(left.left==null && right.right!=null) return false;
        if(left.right==null && right.left!=null) return false;
        if(left.val!=right.val) return false;
        return isSymmetricRecursive(left.left,right.right) && isSymmetricRecursive(left.right,right.left);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
