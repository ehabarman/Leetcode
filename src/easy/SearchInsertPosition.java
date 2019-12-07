package easy;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = s.nextInt();

        System.out.println(searchInsert(nums, target));


    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        if( end <= start )
            return nums[end] < target ? end + 1: end;
        else{
            int mid = (end + start) / 2;
            if(nums[mid] == target)
                return mid;

            if(nums[mid] < target){
                return binarySearch(nums, target, mid + 1, end);
            }
            else{
                mid = (end - start + 1) % 2 == 0 ? mid : mid - 1;
                return binarySearch(nums, target, start, mid);
            }
        }
    }
}
