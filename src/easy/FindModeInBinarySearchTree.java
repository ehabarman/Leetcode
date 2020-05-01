package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        treeToMap(root, map);
        int max = 0;
        List<Integer> mode = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) >= max){
                if ( map.get(key) > max) {
                    max = map.get(key);
                    mode = new ArrayList<>();
                }
                mode.add(key);
            }
        }
        return mode.stream().mapToInt(Integer::intValue).toArray();
    }

    public void treeToMap(TreeNode root, Map<Integer, Integer> map) {
        if(root == null) return;
        if(map.containsKey(root.val)) map.put(root.val, map.get(root.val) + 1);
        else map.put(root.val, 1);
        treeToMap(root.left, map);
        treeToMap(root.right, map);
    }
}
