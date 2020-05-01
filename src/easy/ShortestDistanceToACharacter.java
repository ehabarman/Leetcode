package easy;

import java.util.HashSet;
import java.util.Set;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] result = new int[n];
        Set<Integer> zeros = new HashSet<>();
        int dist;
        for (int i = 0; i < n; i++) result[i] = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                result[i] = 0;
                zeros.add(i);
            }
        }
        for (int zero : zeros) {
            dist = 1;
            for (int j = zero - 1; j >= 0; j--) {
                if (dist < result[j]) {
                    result[j] = dist;
                    dist++;
                } else break;
            }
            dist = 1;
            for (int j = zero + 1; j < n; j++) {
                if (dist < result[j]) {
                    result[j] = dist;
                    dist++;
                } else break;
            }
        }
        return result;
    }
}
