package medium;

import common.TreeNode;

public class FlattenBinaryTreeToLinkedList {

	public static TreeNode solution(TreeNode node) {
		if (node == null) {
			return null;
		}

		if (node.left == null && node.right == null) {
			return node;
		}

		TreeNode right = solution(node.right);
		TreeNode left = solution(node.left);

		if (left == null) {
			return right;
		} else if (right == null) {
			node.right = node.left;
			node.left = null;
			return left;
		} else {
			left.right = node.right;
			node.right = node.left;
			node.left = null;
			return right;
		}
	}
}
