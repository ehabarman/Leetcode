package easy;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int currentMax = arr[arr.length - 1], temp;
        arr[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            temp = arr[i];
            arr[i] = currentMax;
            currentMax = Math.max(currentMax, temp);
        }
        return arr;
    }
}
