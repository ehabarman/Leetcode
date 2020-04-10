package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
    List<Integer> sortedTreeNodes =new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        int min= sortedTreeNodes.get(1)- sortedTreeNodes.get(0);
        for(int i = 2; i< sortedTreeNodes.size(); i++)
        {
            if((sortedTreeNodes.get(i)- sortedTreeNodes.get(i-1))<min)
                min= sortedTreeNodes.get(i)- sortedTreeNodes.get(i-1);
        }
        return min;
    }

    public void inOrderTraversal(TreeNode root)
    {
        if(root!=null)
        {
            inOrderTraversal(root.left);
            sortedTreeNodes.add(root.val);
            inOrderTraversal(root.right);
        }
    }
}
