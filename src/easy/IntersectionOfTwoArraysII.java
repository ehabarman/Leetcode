package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = arrayToMap(nums1);
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int num : nums2){
            if(map1.containsKey(num) && map1.get(num) > 0) {
                intersection.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for(int num: intersection)
            result[i++] = num;
        return result;
    }

    public HashMap<Integer, Integer> arrayToMap(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr)
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        return map;
    }

}
