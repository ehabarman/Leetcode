package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        for( String s : binaryTreePaths(root))
            sum += Integer.parseInt(s, 2);
        return sum;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null)
            return paths;

        if (root.left == null && root.right == null) {
            paths.add(root.val + "");
            return paths;
        }
        for (String path : binaryTreePaths(root.left))
            paths.add(root.val + path);

        for (String path : binaryTreePaths(root.right))
            paths.add(root.val + path);

        return paths;
    }


}
