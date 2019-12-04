package easy;

import java.util.Scanner;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String B = s.nextLine();
        System.out.println(repeatedStringMatch(A, B));
    }

    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int max = 2 * A.length() + B.length();
        int count = 1;
        while (sb.length() < max && sb.indexOf(B) == -1) {
            sb.append(A);
            count++;
        }
        return sb.indexOf(B) == -1 ? -1 : count;
    }

}
