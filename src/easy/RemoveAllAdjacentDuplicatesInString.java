package easy;

import java.util.Scanner;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();

        System.out.println(removeDuplicates(line));

    }

    public static String removeDuplicates(String S) {
        boolean isRemoved;
        do {
            isRemoved = false;
            for (int index = 0; index < S.length() - 1; index++) {
                if (S.charAt(index) == S.charAt(index + 1)) {
                    S = S.substring(0, index) + S.substring(index + 2);
                    isRemoved = true;
                    break;
                }
            }
        } while (isRemoved != false);

        return S;
    }

}
