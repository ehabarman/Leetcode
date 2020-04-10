package easy;

import common.Node;

public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        int max = 0;
        if( root.children != null){
            for(Node node : root.children)
                max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }
}
