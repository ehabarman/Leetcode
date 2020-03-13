package easy;

import java.util.HashSet;

public class SubtreeOfAnotherTree {
    HashSet< String > trees = new HashSet < > ();
    public boolean isSubtree(BinaryTreeTilt.TreeNode s, BinaryTreeTilt.TreeNode t) {
        String tree1 = preorder(s, true);
        String tree2 = preorder(t, true);
        return tree1.indexOf(tree2) >= 0;
    }
    public String preorder(BinaryTreeTilt.TreeNode t, boolean left) {
        if (t == null) {
            if (left)
                return "lnull";
            else
                return "rnull";
        }
        return "#"+t.val + " " +preorder(t.left, true)+" " +preorder(t.right, false);
    }
}
