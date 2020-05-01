package easy;

import common.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == t2) return null;
        int left = t1 == null ? 0 : t1.val;
        int right = t2 == null ? 0 : t2.val;
        TreeNode newNode = new TreeNode(left + right);
        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newNode;
    }
}
