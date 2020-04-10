package easy;

import java.util.Arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int avg = (sumA + sumB)/2;
        for(int a: A){
            for(int b: B){
                if((sumA - a + b) == avg) {
                    res[0] = a;
                    res[1] = b;
                    break;
                }
            }
        }
        return res;
    }
}
