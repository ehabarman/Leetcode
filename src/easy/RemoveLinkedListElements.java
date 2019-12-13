package easy;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(temp != null){
            if (temp.next == null)
                break;
            else if(temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
