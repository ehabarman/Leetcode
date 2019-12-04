package easy;

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(gcdOfStrings(s.nextLine(), s.nextLine()));

    }

    public static String gcdOfStrings(String str1, String str2) {
        String common = str1.substring(0, gcd_recursive(str1.length(), str2.length()));
        if (isDivisor(str1, common) && isDivisor(str2, common))
            return common;
            return "";
    }

    public static int gcd_recursive(int a, int b) {
        return b > 0 ? gcd_recursive(b, a % b) : a;
    }

    public static boolean isDivisor(String line, String divisor) {
        int k = divisor.length();
        int d = line.length() / k;
        for (int i = 0; i < d; i++)
            for (int j = 0; j < k; j++)
                if (divisor.charAt(j) != line.charAt(i * k + j))
                    return false;
        return true;
    }
}
