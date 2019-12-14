package easy;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        byte count = 0;
        for(int i = 0; i < 32 ; i++){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
