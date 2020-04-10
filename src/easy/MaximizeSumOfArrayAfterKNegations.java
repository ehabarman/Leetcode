package easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : A) pq.offer(num);
        int top;
        if (A.length != 0)
            while (K-- > 0) {
                top = pq.poll();
                if (top >= 0) {
                    if (K % 2 == 1) {
                        pq.offer(top);
                    } else {
                        pq.offer(-top);
                    }
                    break;
                }
                pq.offer(-top);
            }

        int sum = 0;
        while (pq.size() != 0) sum += pq.poll();
        return sum;
    }

    public int largestSumAfterKNegations2(int[] A, int K) {
        int start = 0;
        int temp;
        for(int i = 1; i < A.length; i++){
            if(A[i] < 0){
                while( start < i && A[start] < 0) start++;
                if(start < i && A[start] >= 0){
                    temp = A[i];
                    A[i] = A[start];
                    A[start] = temp;
                }
            }
        }
        Arrays.sort(A, 0, ++start);
        for(int num: A)
            System.out.print(num + " ");

        int i;
        for(i = 0; i < A.length && A[i] < 0 && K> 0; i++, K--){
            A[i] *= -1;
        }
        return K % 2 == 1? IntStream.of(A).min().getAsInt() * -2 + IntStream.of(A).sum() : IntStream.of(A).sum();
    }
}
