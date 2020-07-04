package easy;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while (n-- > 0) {
            result[k++] = nums[i++];
            result[k++] = nums[j++];
        }
        return result;
    }

}
