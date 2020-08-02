package medium;

import java.util.HashMap;
import java.util.Map;

public class LetterTilePossibilities {

    private static int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040};

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : tiles.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int[] lettersCount = new int[map.size()];
        int i = 0;
        for (Integer value : map.values()) {
            lettersCount[i++] = value;
        }
        return getPossibilities(lettersCount, i, 0);
    }

    private int getPossibilities(int[] lettersCount, int size, int index) {
        if (index == size) {
            return factorialCount(lettersCount);
        }
        int currentCount = lettersCount[index];
        int possibilities = 0;
        for (int i = 0; i <= currentCount; i++) {
            lettersCount[index] = currentCount - i;
            possibilities += getPossibilities(lettersCount, size, index + 1);
        }
        lettersCount[index] = currentCount;
        return possibilities;
    }

    private int factorialCount(int[] lettersCount) {
        int total = 0;
        int dom = 1;
        for (Integer x : lettersCount) {
            total += x;
            dom *= factorials[x];
        }
        if (total == 0) return 0;
        return factorials[total] / dom;
    }

}
