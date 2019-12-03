package easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        System.out.println(balancedStringSplit(line));
    }

    public static int balancedStringSplit(String s) {
        int lcounter = 0, rCounter = 0, result = 0, i = 0;
        char current;
        do {
            current = s.charAt(i);
            if (current == 'L')
                lcounter++;
            else
                rCounter++;
            if (rCounter == lcounter) {
                result++;
                lcounter = rCounter = 0;
            }
        } while (++i < s.length());

        return result;
    }
}