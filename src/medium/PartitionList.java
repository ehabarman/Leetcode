package medium;

import common.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode lower = new ListNode();
        ListNode greater = new ListNode();
        ListNode lowerTemp = lower;
        ListNode greaterTemp = greater;
        ListNode temp;
        while (head != null){
            temp = head.next;
            if(head.val < x){
                lowerTemp.next = head;
                lowerTemp = lowerTemp.next;
            }
            else {
                greaterTemp.next = head;
                greaterTemp = greaterTemp.next;
            }
            head.next = null;
            head = temp;
        }

        if(lower.next == null)
            return greater.next;

        lowerTemp.next = greater.next;
        return lower.next;
    }
}
