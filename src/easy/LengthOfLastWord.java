package easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        System.out.println(lengthOfLastWord(line));
    }

//    public static int lengthOfLastWord(String s) {
//        Pattern p = Pattern.compile("\\S+$");
//        Matcher m = p.matcher(s.trim());
//        return m.find() ? m.group().trim().length() : 0;
//    }

    public static int lengthOfLastWord(String s){
        s = s.trim();
        if(s.length() == 0)
            return 0;

        int count = 0;
        for(int i = s.length() - 1; i >= 0 ; i--)
            if( s.charAt(i) != ' ')
                count++;
            else
                break;

        return count;
    }

}
