package easy;

import java.util.Scanner;

public class NonDecreasingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(checkPossibility(arr));

    }

    public static boolean checkPossibility(int[] nums) {
        boolean b = false;
        for(int i = 0; i < nums.length-1; i++)
            if (nums[i] > nums[i+1])
                if (b)
                    return false;
                else{
                    b = true;
                    nums[i+1] = i > 0 && nums[i+1] < nums[i-1] ? nums[i] : nums[i+1];
                }
        return true;
    }
}
