package easy;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        arr = plusOne(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int temp;

        for (int i = digits.length - 1; i >= 0; i--) {
            temp = digits[i] + carry;
            carry = temp / 10;
            digits[i] = temp % 10;
        }

        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++)
                result[i + 1] = digits[i];
            return result;
        }
    }
}
