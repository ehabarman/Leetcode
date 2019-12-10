package easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] arr1 = new int[x];
        for (int i = 0; i < x; i++)
            arr1[i] = s.nextInt();
        Arrays.sort(arr1);
        ListNode l1 = arrayToLinkList(arr1);

        ListNode result = deleteDuplicates(l1);
        do {
            System.out.print(result.val + " ");
            result = result.next;
        } while (result != null);
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static ListNode arrayToLinkList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

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
