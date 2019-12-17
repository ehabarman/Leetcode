package easy;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        for (int i = 0; i < 31 && n!=0 ; i++) {
            System.out.println(n);
            if ( (n & 3) == 0 || (n & 3) == 3)
                return false;
            n >>= 1;
        }
        return true;
    }
}
