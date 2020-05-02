package easy;

import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed().sorted((a, b) -> {
            int aBits = Integer.bitCount(a);
            int bBits = Integer.bitCount(b);
            if(aBits != bBits) return aBits - bBits;
            else return a - b;
        }). mapToInt(i -> i).toArray();
    }


}
