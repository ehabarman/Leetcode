package easy;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    public boolean isPathCrossing(String path) {
        Set<Integer> pairs = new HashSet<>();
        pairs.add(10001000);
        int x = 1000, y = 1000;
        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            int pair = x * 10000 + y;
            if (pairs.contains(pair)) return true;
            pairs.add(pair);
        }
        return false;
    }
}
