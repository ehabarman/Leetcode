package medium;

import java.util.LinkedList;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] A, int K) {
        int max = 0;
        int current = 0;
        LinkedList<Integer> zeros = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j < zeros.size(); j++) System.out.print(zeros.get(j) + " ");
            System.out.println();
            if (A[i] == 1) {
                current++;
            } else if (zeros.size() < K) {
                current++;
                zeros.add(i);
            } else if (!zeros.isEmpty()) {
                max = Math.max(max, current);
                current = i - zeros.poll();
                zeros.add(i);
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        longestOnes(new int[]{0, 0, 1, 1, 1, 0, 0},0);
    }
}
