package easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(reverseWords(s.nextLine()));
    }

    public static String reverseWords(String s) {
        Matcher m = Pattern.compile("\\S+").matcher(s);
        StringBuilder sb = new StringBuilder();
        if (m.find())
            sb.append(new StringBuilder(m.group()).reverse().toString());
        while (m.find()) {
            sb.append(' ');
            sb.append(new StringBuilder(m.group()).reverse().toString());
        }

        return sb.toString();
    }
}
