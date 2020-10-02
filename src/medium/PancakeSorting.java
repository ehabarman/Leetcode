package medium;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {

    public List<Integer> pancakeSort(int[] A) {
        List<Integer> ans = new ArrayList<>();
        int maxIndex, max, j;
        for (int i = A.length - 1; i > 0; i--) {
            maxIndex = 0;
            max = A[0];
            for (j = 0; j <= i; j++) {
                if(A[j] > max) {
                    max = A[j];
                    maxIndex = j;
                }
            }
            if (maxIndex == i) continue;
            if (maxIndex != 0) {
                flipInRange(A, maxIndex);
                ans.add(maxIndex + 1);
            }
            flipInRange(A, i);
            ans.add(i + 1);
        }
        return ans;
    }

    private void flipInRange(int[] A, int end) {
        int upperBound = end / 2 + end % 2;
        for(int i = 0; i < upperBound; i++) {
            int temp = A[i];
            A[i] = A[end - i];
            A[end - i] = temp;
        }
    }
}
