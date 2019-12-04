package easy;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        n = removeDuplicates(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static int removeDuplicates(int[] nums) {
        int newSize = 1;
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[newSize-1]){
                temp = nums[i];
                nums[i] = nums[newSize];
                nums[newSize] = temp;
                newSize++;
            }
        }
        return newSize;
    }
}
