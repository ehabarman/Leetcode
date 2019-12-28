package easy;


import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        int[] occurrences = new int[map.size()];
        int i = 0;
        for( int n : map.values())
            occurrences[i++] = n;
        Arrays.sort(occurrences);
        for(i = 0; i < occurrences.length - 1; i++)
            if(occurrences[i] == occurrences[i+1])
                return false;
        return true;
    }
}
