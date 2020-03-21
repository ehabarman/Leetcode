package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int levels = maxDepth(root);
        for (int i = 0; i < levels; i++)
            list.add(new ArrayList());
        buildLists(root, (ArrayList) list, 1);
        return list;
    }

    public void buildLists(TreeNode n, ArrayList<ArrayList> list, int level) {
        if (n != null)
        {
            list.get(list.size() - level).add(n.val);
            buildLists(n.left, list, level + 1);
            buildLists(n.right, list, level + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }

}
