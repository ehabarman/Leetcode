package easy;

public class ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        int sum = 0;
        ListNode temp = head;
        while( temp != null){
            sum = (sum << 1) + temp.val;
            temp = temp.next;
        }
        return sum;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
