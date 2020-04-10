package medium;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] arr) {
        int prev = 0;
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            while (i < arr.length - 1 && arr[i + 1] == arr[i] + 1) {
                i++;
            }
            if (prev == i)
                list.add("" + arr[prev]);
            else
                list.add(arr[prev] + "->" + arr[i]);
            i++;
            prev = i;
        }

        return list;
    }
}
