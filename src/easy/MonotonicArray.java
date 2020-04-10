package easy;

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean dec = false;
        boolean inc = false;
        for(int i = 1; i < A.length; i++){
            if(A[i] >= A[i-1]) inc = true;
            else dec = true;
            if(dec && inc) break;
        }
        return !(inc && dec);
    }
}
