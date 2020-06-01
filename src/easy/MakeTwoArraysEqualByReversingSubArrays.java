package easy;

public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) return false;
        short[] count = new short[1001];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            count[target[i]]--;
        }
        for (int a : count) {
            if (a != 0) return false;
        }
        return true;
    }
}
