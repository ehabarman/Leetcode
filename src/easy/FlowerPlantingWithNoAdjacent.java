package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlowerPlantingWithNoAdjacent {
    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, HashSet<Integer>> gMap = new HashMap();
        for (int i = 1; i <= N; i++) gMap.put(i, new HashSet<Integer>());

        for (int i = 0; i < paths.length; i++) {
            gMap.get(paths[i][0]).add(paths[i][1]);
            gMap.get(paths[i][1]).add(paths[i][0]);
        }

        int[] result = new int[N];
        Set<Integer> neighbourFlowers;
        for (int i = 1; i <= N; i++) {
            neighbourFlowers = new HashSet<>();
            for (int neighbour : gMap.get(i)) {
                neighbourFlowers.add(result[neighbour - 1]); // Because array starts at 0. not at 1
            }

            for (int flower = 1; flower <= 4; flower++) {
                if (!neighbourFlowers.contains(flower)) {
                    // Flower is available for use
                    result[i - 1] = flower; // Because array starts at 0. not at 1
                }
            }
        }

        return result;
    }
}