package easy;

import java.util.HashMap;

public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 0)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (!map.containsKey(deck[i]))
                map.put(deck[i], 1);
            else map.put(deck[i], map.get(deck[i]) + 1);
        }

        int gcd = map.get(deck[0]);
        for (int n : map.values()) {
            gcd = gcd(gcd, n);
        }
        return gcd >= 2;
    }
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
