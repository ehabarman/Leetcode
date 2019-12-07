package easy;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n ; i++)
            strs[i] = s.next();

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        try{
            int i =0, j;
            char temp;
            while(true){
                temp = strs[0].charAt(i);
                for( j = 1; j<strs.length;j++)
                    if(strs[j].charAt(i) != temp)
                        throw new Exception();
                res.append(temp);
                i++;
            }
        }catch (Exception e){

        }
        return res.toString();
    }
}
