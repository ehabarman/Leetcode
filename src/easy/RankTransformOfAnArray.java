package easy;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] rank = new int[arr.length];
        int r = 1;
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        if(arr.length == 0){
            return new int[0];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(arr2[0], r);
        for(int i=1; i<arr2.length; i++){
            if(arr2[i] != arr2[i-1]){
                ++r;
                hm.put(arr2[i], r);
            }
        }
        for(int i=0; i<arr.length; i++){
            rank[i] = hm.get(arr[i]);
        }
        return rank;
    }
}
