package easy;

import common.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            solution.add(current.val);
            if(current.children != null && !current.children.isEmpty())
                for(int i = current.children.size() - 1 ; i >= 0; i --) {
                    stack.push(current.children.get(i));
                }
        }
        return solution;
    }
}
