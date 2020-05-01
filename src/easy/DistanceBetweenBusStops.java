package easy;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination) return 0;
        int way1 = 0, way2 = 0;
        if (start <= destination) {
            return helper(distance, start, destination);
        } else {
            return helper(distance, destination, start);
        }
    }

    public int helper(int[] distance, int start, int destination) {
        int way1 = 0, way2 = 0;
        for (int i = start; i < destination; i++) {
            way1 += distance[i];
        }
        for (int i = destination; i < distance.length; i++) {
            way2 += distance[i];
        }
        for (int i = 0; i < start; i++) {
            way2 += distance[i];
        }
        return Math.min(way1, way2);
    }
}
