package easy;

import java.util.HashMap;
import java.util.Scanner;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(repeatedNTimes(arr));

    }

    public static int repeatedNTimes(int[] A) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0; i <= A.length; i++)
            if(map.containsKey(A[i]))
                return A[i];
            else
                map.put(A[i],true);

        return -1;
    }
}
