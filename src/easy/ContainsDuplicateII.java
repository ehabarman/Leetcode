package easy;

import java.util.Arrays;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1)
            return false;

        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++)
            pairs[i] = new Pair(nums[i], i);


        Arrays.sort(pairs);
        int i=0;
        int j = 0;
        while(j < nums.length){
            if( i == j)
                j++;

            if(pairs[i].val == pairs[j].val){
                if(pairs[j].index - pairs[i].index <= k)
                    return true;
            }
            i++;
        }

        return false;
    }

    static class Pair implements Comparable<Pair> {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.val > o.val)
                return 1;
            else if (this.val < o.val)
                return -1;
            else if (this.index > o.index)
                return 1;
            else
                return -1;
        }
    }
}
