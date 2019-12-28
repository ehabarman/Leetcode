package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> levels = new ArrayList<>();
        Stack<TreeNode> fbs = new Stack<>();
        fbs.push(root);
        while (!fbs.empty()){
            double sum = 0;
            int nodes = fbs.size();
            Stack<TreeNode> temp = new Stack<>();

            while(!fbs.empty()){
                TreeNode current = fbs.pop();
                sum += current.val;
                if(current.left != null)
                    temp.push(current.left);
                if(current.right != null)
                    temp.push(current.right);
            }
            fbs = temp;
            levels.add(sum/nodes);
        }
        return levels;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


