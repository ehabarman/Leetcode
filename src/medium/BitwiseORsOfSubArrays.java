package medium;

import java.util.HashSet;
import java.util.Set;

public class BitwiseORsOfSubArrays {

    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> combinations = new HashSet();
        Set<Integer> cur = new HashSet();
        for (int num: A) {
            Set<Integer> cur2 = new HashSet();
            for (int num2: cur)
                cur2.add(num | num2);
            cur2.add(num);
            cur = cur2;
            combinations.addAll(cur);
        }

        return combinations.size();
    }
}
