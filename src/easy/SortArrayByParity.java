package easy;

import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        arr = sortArrayByParity(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static int[] sortArrayByParity(int[] A) {
        int balance = 0;
        for (int i = 0; i<A.length; i++) {
            if (A[i]%2==0) {
                int tmp = A[i];
                A[i] = A[balance];
                A[balance] = tmp;
                balance ++;
            }
        }
        return A;
    }
}
