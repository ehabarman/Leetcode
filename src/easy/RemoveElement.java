package easy;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ;i++)
            arr[i] = s.nextInt();

        int len = removeElement(arr, m);
        for(int i = 0; i < len ;i++)
            System.out.print(arr[i] + " ");

    }

    public static int removeElement(int[] nums, int val) {
        if( nums.length == 1)
            return nums[0] == val ? 0 : 1;

        int j = 0;
        for(int i = 0 ; i< nums.length ; i++)
        {
            if( nums[i] == val)
                continue;
            else{
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
