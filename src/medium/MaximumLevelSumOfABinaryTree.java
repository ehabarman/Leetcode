package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE, maxLevel = 1;
        int level = 1;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list.size() != 0) {
            List<TreeNode> temp = new ArrayList<>();
            int currentSum = 0;
            for (TreeNode node : list) {
                currentSum += node.val;
                if (node.right != null) temp.add(node.right);
                if (node.left != null) temp.add(node.left);
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLevel = level;
            }
            level++;
            list = temp;
        }
        return maxLevel;
    }
}
