package easy;

import java.util.*;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 2, 3}));
    }

    public static int thirdMax(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for ( int num : map.keySet()) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        return max1 == max2 || max2 == max3 ? max1 : max3;
    }
}
