package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RelativeSortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++)
            arr1[i] = s.nextInt();

        for (int i = 0; i < m; i++)
            arr2[i] = s.nextInt();

        int[] result = relativeSortArray(arr1, arr2);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[arr1.length];
        int i = 0;
        for (i = 0; i < arr1.length; i++)
            if (map.containsKey(arr1[i]))
                map.put(arr1[i], map.get(arr1[i]) + 1);
            else
                map.put(arr1[i], 1);
        int j = 0;
        int count = 0;
        for (i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                count = map.get(arr2[i]);
                map.remove(arr2[i]);
                while (count-- > 0)
                    result[j++] = arr2[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        map.forEach((k, v) -> {
            for (int s = 0; s < v; s++)
                list.add(k);
        });

        Object[] remaining = list.toArray();
        Arrays.sort(remaining);

        for (i = 0; i < remaining.length; i++)
            result[j++] = (int) remaining[i];

        return result;
    }
}
