package easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        char[] arr = line.toCharArray();
        int len = compress(arr);
        System.out.println(len);
        for (int i =0; i < len;i++)
            System.out.print(arr[i]);

    }
    public static int compress(char[] chars) {
        String s = new String(chars);
        Pattern p = Pattern.compile("(.)\\1*");
        Matcher m = p.matcher(s);
        StringBuilder sb = new StringBuilder("");
        String temp;
        int length;
        int count = 0;
        while(m.find()){
            temp = m.group();
            length = temp.length();
            count++;
            sb.append(temp.charAt(0));
            if(length == 1)
                continue;
            else{
                count += (""+length).length();
                sb.append(length);
            }
        }
        for(int i =0; i< count;i++)
            chars[i]=sb.charAt(i);

        return count;
    }
}
