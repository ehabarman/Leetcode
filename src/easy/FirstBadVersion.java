package easy;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            right = isBadVersion(mid) ? mid : right;
            left = isBadVersion(mid) ? left : mid +1;
        }
        return left;
    }

    public boolean isBadVersion(int n){
        return true;
    }
}
