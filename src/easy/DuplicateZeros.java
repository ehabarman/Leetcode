package easy;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int countZeros = 0;
        int len = arr.length - 1;
        for (int i = 0; i <= len - countZeros; i++) {
            if (arr[i] == 0) {
                if (i == len - countZeros) {
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
                countZeros++;
            }
        }
        int last = len - countZeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + countZeros] = 0;
                countZeros--;
                arr[i + countZeros] = 0;
            } else {
                arr[i + countZeros] = arr[i];
            }
        }
    }
}
