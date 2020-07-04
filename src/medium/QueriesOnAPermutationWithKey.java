package medium;

import java.util.LinkedList;
import java.util.List;

public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> permutations = new LinkedList<>();
        for(int i = 1; i <= m; i++) {
            permutations.add(i);
        }
        int[] result = new int[queries.length];
        int index = 0;
        for(int query: queries) {
            for(int i = 0; i < m; i++) {
                if (permutations.get(i) == query) {
                    result[index++] = i;
                    permutations.remove(i);
                    permutations.add(0, query);
                    break;
                }
            }
        }
        return result;
    }
}
