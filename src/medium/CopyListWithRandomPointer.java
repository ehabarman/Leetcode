package medium;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Map<Node, Node> nodes = new HashMap<>();
        Node headTemp = head;
        while(headTemp != null) {
            Node current = nodes.getOrDefault(headTemp, new Node(headTemp.val));
            if (headTemp.next != null) {
                Node next = nodes.getOrDefault(headTemp.next, new Node(headTemp.next.val));
                current.next = next;
                nodes.put(headTemp.next, next);
            }
            if (headTemp.random != null) {
                Node random = nodes.getOrDefault(headTemp.random, new Node(headTemp.random.val));
                current.random = random;
                nodes.put(headTemp.random, random);
            }
            nodes.put(headTemp, current);
            headTemp = headTemp.next;
        }

        return nodes.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
