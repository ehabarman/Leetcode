package easy;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = getLength(headA), countB = getLength(headB);
        while (countA > 0 && countB > 0){
            countA--;
            countB--;
        }
        ListNode tempA = headA, tempB = headB;
        while (countA-- > 0) tempA= tempA.next;
        while (countB-- > 0) tempB= tempB.next;
        while(tempA != null && tempB != null){
            if(tempA == tempB)
                return tempA;
            tempA= tempA.next;
            tempB= tempB.next;
        }
        return null;
    }

    public int getLength(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
