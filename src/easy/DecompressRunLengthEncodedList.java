package easy;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        if (nums == null) { return null; }
        int outputLength = 0;
        for(int i = 0; i < nums.length; i += 2) {
            outputLength += nums[i];
        }
        int[] result = new int[outputLength];
        int resultIndex = 0;
        for(int i = 0; i < nums.length; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                result[resultIndex] = nums[i+1];
                resultIndex++;
            }
        }
        return result;
    }
}
