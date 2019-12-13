package easy;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode singleStep = head;
        ListNode doubleStep = head;

        while (singleStep != null && singleStep.next != null) {
            singleStep = singleStep.next.next;
            doubleStep = doubleStep.next;

            if (singleStep == doubleStep) {
                return true;
            }
        }

        return false;
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
