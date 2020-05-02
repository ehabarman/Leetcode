package easy;

import common.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node == null) continue;

            list.add(0, node.val);
            for (Node n : node.children) {
                stack.push(n);
            }
        }

        return list;
    }
}
