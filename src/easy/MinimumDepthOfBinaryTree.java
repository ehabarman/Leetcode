package easy;

import common.TreeNode;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        if( root.left == null && root.right == null)
            return 1;

        if( root.left == null)
            return minDepth(root.right);

        if( root.right == null)
            return minDepth(root.left);

        return Math.min(minDepth(root.right), minDepth(root.left));
    }

}
