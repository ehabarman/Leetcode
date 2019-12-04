package easy;

import java.util.Scanner;

public class SquaresOfASortedArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        arr = sortedSquares(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static int[] sortedSquares(int[] A) {

        int positiveIndex = firstPositiveIndex(A, 0, A.length -1);
        int negativeIndex = positiveIndex == -1? A.length -1: positiveIndex-1;

        if(positiveIndex < 0)
            positiveIndex = Integer.MAX_VALUE;

        int[] squared = new int[A.length];
        int i = 0;
        while( positiveIndex < A.length & negativeIndex >= 0){
            if(A[positiveIndex] >= -1* A[negativeIndex])
                squared[i++] = (int)Math.pow(A[negativeIndex--], 2);
            else
                squared[i++] = (int)Math.pow(A[positiveIndex++], 2);
        }
        while(positiveIndex < A.length)
            squared[i++] = (int)Math.pow(A[positiveIndex++], 2);
        while(negativeIndex >= 0)
            squared[i++] = (int)Math.pow(A[negativeIndex--], 2);


        return squared;
    }

    public static int firstPositiveIndex(int[] arr, int lower, int upper){

        if(upper - lower == 0)
            return arr[lower] >=0 ? lower: -1;

        int mid = (upper + lower) / 2;

        if(arr[mid] >= 0 && mid == 0)
            return 0;
        else if(arr[mid] >= 0 && arr[mid - 1] < 0)
            return mid;
        else if(arr[mid] >= 0)
            return firstPositiveIndex(arr, lower, mid - 1);
        else
            return firstPositiveIndex(arr, mid + 1, upper );
    }
}
