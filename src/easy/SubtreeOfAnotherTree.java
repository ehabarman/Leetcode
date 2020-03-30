package easy;

import common.TreeNode;

import java.util.HashSet;

public class SubtreeOfAnotherTree {
    HashSet< String > trees = new HashSet < > ();
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = preOrder(s, true);
        String tree2 = preOrder(t, true);
        return tree1.indexOf(tree2) >= 0;
    }

    public String preOrder(TreeNode t, boolean left) {
        if (t == null) {
            if (left)
                return "lnull";
            else
                return "rnull";
        }
        return "#"+t.val + " " +preOrder(t.left, true)+" " +preOrder(t.right, false);
    }
}
