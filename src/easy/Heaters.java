package easy;

import java.util.Arrays;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int minHeaterRadius = Integer.MIN_VALUE;
        for (int housePosition : houses) {
            int rightHeaterPosition = findClosestRightHeater(heaters, housePosition);
            if (rightHeaterPosition == housePosition) {
                minHeaterRadius = Math.max(minHeaterRadius, 0);
            } else {
                int leftHeaterPosition = rightHeaterPosition > 0 ? rightHeaterPosition - 1 : rightHeaterPosition;
                int leftHeaterDistance = Math.abs(housePosition - heaters[leftHeaterPosition]);
                int rightHeaterDistance = Math.abs(housePosition - heaters[rightHeaterPosition]);

                minHeaterRadius = Math.max(minHeaterRadius, Math.min(leftHeaterDistance, rightHeaterDistance));
            }
        }

        return minHeaterRadius;
    }

    private int findClosestRightHeater(int[] heaters, int position) {
        int left = 0;
        int right = heaters.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (heaters[mid] == position) {
                return mid;
            } else if (heaters[mid] > position) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
