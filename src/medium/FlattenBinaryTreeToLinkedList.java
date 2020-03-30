package medium;

import common.TreeNode;

public class FlattenBinaryTreeToLinkedList {

	public static TreeNode flatten(TreeNode node) {
		if(node == null)
			return node;

		TreeNode left =  flatten(node.left);
		TreeNode right = flatten(node.right);

		if(left  != null)
			left.right = node.right;

		if(right != null)
			node.right = node.left;

		return right != null ? right : left;
	}
}
