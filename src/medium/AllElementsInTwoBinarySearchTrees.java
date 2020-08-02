package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getElementsSorted(root1, list1);
        getElementsSorted(root2, list2);
        int index1 = 0, index2 = 0, len1 = list1.size(), len2 = list2.size();
        int num1, num2;
        while (index1 < len1 && index2 < len2) {
            num1 = list1.get(index1);
            num2 = list2.get(index2);
            if (num1 <= num2) {
                result.add(num1);
                index1++;
            } else {
                result.add(num2);
                index2++;
            }
        }
        while (index1 < len1) {
            result.add(list1.get(index1));
            index1++;
        }
        while (index2 < len2) {
            result.add(list2.get(index2));
            index2++;
        }
        return result;
    }

    public void getElementsSorted(TreeNode root, List<Integer> list) {
        if (root == null) return;
        getElementsSorted(root.left, list);
        list.add(root.val);
        getElementsSorted(root.right, list);
    }

}
