package easy;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++)
            nums1[i] = s.nextInt();

        for (int i = 0; i < n; i++)
            nums2[i] = s.nextInt();

        merge(nums1, m, nums2, n);
        for (int i = 0; i < n + m; i++)
            System.out.print(nums1[i] + " ");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            for (int j = m - 1; j >= 0; j--) {
                if (nums1[j] > nums1[j + 1]){
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
                else
                    break;
            }
            m++;
        }
    }
}
