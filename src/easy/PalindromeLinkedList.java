package easy;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        fast = reverse(slow);
        slow = head;
        while (fast != null) {
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse( ListNode head){
        if (head == null)
            return null;
        ListNode newHead = null;
        ListNode currHead = head;

        while (currHead != null) {
            ListNode next = currHead.next;
            currHead.next = newHead;
            newHead = currHead;
            currHead = next;
        }
        return newHead;
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
