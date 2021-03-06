package easy;

import java.util.HashMap;
import java.util.Objects;

public class NumberOfEquivalentDominoPairs {
    class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return (x == pair.x &&
                    y == pair.y) || (x == pair.y &&
                    y == pair.x);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y) + Objects.hash(y, x);
        }
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        HashMap<Pair, Integer> hm = new HashMap<>();

        for (int[] domino : dominoes) {
            Pair pair1 = new Pair(domino[0], domino[1]);

            if (hm.containsKey(pair1)) {
                res += hm.get(pair1);
            }
            hm.put(pair1, hm.getOrDefault(pair1, 0) + 1);
        }
        return res;
    }
}
