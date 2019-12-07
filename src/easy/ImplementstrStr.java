package easy;

import java.util.Scanner;

public class ImplementstrStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String haystack = s.nextLine();
        String needle = s.nextLine();
        System.out.println(strStr(haystack, needle));

    }
    //note finite automata caused time limit exceeded (input was too huge that it took more time to build state than direction comparison)
    public static int strStr(String haystack, String needle) {

        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
