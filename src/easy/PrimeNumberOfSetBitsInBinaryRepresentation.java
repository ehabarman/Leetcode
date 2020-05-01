package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
        int count = 0;
        for(int i = L; i <= R; i++) {
            if(primes.contains(Integer.bitCount(i))) count++;
        }
        return count;
    }
}
