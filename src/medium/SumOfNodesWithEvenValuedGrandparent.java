package medium;

import common.TreeNode;

public class SumOfNodesWithEvenValuedGrandparent {
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null) return 0;
        if(root.val % 2 == 0)
            return sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right) + sumOfChildren(root.left) + sumOfChildren(root.right);
        else
            return sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }

    public int sumOfChildren(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null) sum += root.left.val;
        if(root.right != null) sum += root.right.val;
        return sum;
    }
}
