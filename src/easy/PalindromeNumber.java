package easy;

import java.util.Scanner;
import java.util.regex.Matcher;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPalindrome(n));

    }

    public static boolean isPalindrome(int x) {

        if (x < 10)
            return x < 0? false: true;

        int len = (int) (Math.log10(x)) + 1;
        byte[] digits = new byte[len];
        int i = 0;
        while (x > 0) {
            digits[i++] = (byte) (x % 10);
            x /= 10;
        }

        for (i = 0; i < len / 2; i++) {
            if (digits[i] != digits[len - 1 - i])
                return false;
        }
        return true;
    }
}
