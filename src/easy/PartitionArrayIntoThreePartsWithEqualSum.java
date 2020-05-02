package easy;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int left = 0;
        int right = A.length - 1;
        int leftsum = A[left];
        int rightsum = A[right];
        while(left + 1 < right) {
            if (leftsum == sum / 3 && rightsum == sum / 3) {
                return true;
            }
            if (leftsum != sum / 3) {
                leftsum += A[++left];
            }
            if (rightsum != sum / 3) {
                rightsum += A[--right];
            }
        }
        return false;
    }
}
