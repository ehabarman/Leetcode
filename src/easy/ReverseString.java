package easy;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] line = s.nextLine().toCharArray();
        reverseString(line);
        System.out.println(new String(line));

    }

    public static void reverseString(char[] s) {
        for (short i = 0; i <= s.length / 2 - 1; i++) {
            s[i] ^= s[s.length - 1 - i];
            s[s.length - 1 - i] ^= s[i];
            s[i] ^= s[s.length - 1 - i];
        }
    }
}
