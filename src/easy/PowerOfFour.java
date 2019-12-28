package easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        int x = 1;
        while( num >= x && x > 0){
            if( num == x)
                return true;
            x <<= 2;
        }
        return false;
    }
}
