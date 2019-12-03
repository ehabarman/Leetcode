package easy;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i=0; i < n;i++)
            arr[i]=s.nextInt();

        int target = s.nextInt();

        int[] indices = twoSum(arr, target);

        System.out.println(indices[0]);
        System.out.println(indices[1]);



    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]))
            {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            if(! map.containsKey(nums[i]))
                map.put(nums[i], i);
        }

        return result;
    }
}
