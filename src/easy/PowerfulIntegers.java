package easy;

import java.util.*;

public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if (x == 1 && y == 1) return bound >= 2 ? Arrays.asList(2) : new ArrayList<>();
        Set<Integer> found = new HashSet<>();
        Map<Integer, Integer> yPowers = new HashMap<>();
        int jLimit = (y != 1) ? (int) Math.ceil(Math.log10(bound) / Math.log10(y)) : 1;
        int iLimit = (x != 1) ? (int) Math.ceil(Math.log10(bound) / Math.log10(x)) : 1;
        for (int j = 0; j <= jLimit; j++) {
            yPowers.put(j, fastPower(y, j));
        }

        int xValue, yValue;
        for (int i = 0; i < iLimit; i++) {
            xValue = fastPower(x, i);
            for (int j = 0; j < jLimit; j++) {
                yValue = yPowers.get(j);
                if (xValue + yValue <= bound) {
                    found.add(xValue + yValue);
                } else break;
            }
        }
        return new ArrayList<>(found);
    }

    public static int fastPower(int x, int y) {
        int result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;
    }
}
