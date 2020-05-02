package medium;

import common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode result = head;
        while (result != null) {
            list.add(result.val);
            result = result.next;
        }
        Collections.sort(list);
        result = head;
        int index = 0;
        while (result != null) {
            result.val = list.get(index++);
            result = result.next;
        }
        return head;
    }
}
