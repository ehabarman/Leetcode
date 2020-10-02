package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        if (S.length() == 0) return Collections.emptyList();
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) last[S.charAt(i) - 'a'] = i;
        List<Integer> result = new ArrayList<>();
        int j = 0;
        int start = 0;
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
