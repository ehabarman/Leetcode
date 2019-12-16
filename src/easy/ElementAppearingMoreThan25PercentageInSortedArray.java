package easy;

public class ElementAppearingMoreThan25PercentageInSortedArray {

    public int findSpecialInteger(int[] arr) {
        int current = arr[0];
        int len = arr.length;
        double count = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] == current)
                count++;
            else {
                if (count * 100 / len >= 25)
                    return arr[i-1];

                count = 1;
            }
        }

        return arr[len - 1];
    }
}
