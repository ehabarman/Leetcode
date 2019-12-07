package medium;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        ListNode num1 = numToLinkList(x);
        ListNode num2 = numToLinkList(y);
        ListNode result = addTwoNumbers(num1, num2);

        do {
            System.out.print(result.val);
            result = result.next;
        } while (result != null);
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        boolean carry = false;
        int x, y, sum;
        while (l1 != null || l2 != null) {
            x = (l1 != null) ? l1.val : 0;
            y = (l2 != null) ? l2.val : 0;
            sum = x + y;
            if (carry)
                sum += 1;
            carry = sum >= 10 ? true : false;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        temp.next = carry ? new ListNode(1) : null;

        return result.next;
    }

    public static ListNode numToLinkList(int n) {
        ListNode head = new ListNode(n % 10);
        n /= 10;
        ListNode temp = head;

        while (n > 0) {
            temp.next = new ListNode(n % 10);
            n /= 10;
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
