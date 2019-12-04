package easy;

import java.util.Scanner;

public class DIStringMatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = diStringMatch(s.nextLine());
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static int[] diStringMatch(String S) {
        short len = (short)S.length();
        int[] result = new int[len + 1];
        short min = 0, max = len;
        for (short i = 0; i <len; ++i)
            result[i] = S.charAt(i) == 'I' ? min++ : max--;
        result[result.length - 1] = max;
        return result;
    }
}
