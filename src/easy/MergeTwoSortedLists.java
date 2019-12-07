package easy;

import medium.AddTwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        int[] arr1 = new int[x];
        int[] arr2 = new int[y];

        for (int i = 0; i < x; i++)
            arr1[i] = s.nextInt();

        for (int i = 0; i < y; i++)
            arr2[i] = s.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ListNode l1 = arrayToLinkList(arr1);
        ListNode l2 = arrayToLinkList(arr2);

        ListNode result = mergeTwoLists(l1, l2);
        do {
            System.out.print(result.val + " ");
            result = result.next;
        } while (result != null);
        System.out.println();



    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        ListNode temp1 = l1, temp2 = l2;

        while( temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                current.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            }
            else{
                current.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            current = current.next;
        }
        while(temp1 != null){
            current.next = new ListNode(temp1.val);
            temp1 = temp1.next;
            current = current.next;
        }

        while(temp2 != null){
            current.next = new ListNode(temp2.val);
            temp2 = temp2.next;
            current = current.next;
        }

        return head.next;
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
