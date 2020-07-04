package medium;

import common.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null || preorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++)
            insertIntoBST(root, preorder[i]);
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val >= val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
}
