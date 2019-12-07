package easy;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num1 = s.nextLine();
        String num2 = s.nextLine();
        System.out.println(addBinary(num1, num2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        String num1 = new StringBuilder(a).reverse().toString();
        String num2 = new StringBuilder(b).reverse().toString();
        int len1 = num1.length();
        int len2 = num2.length();
        int i = 0, j = 0;
        boolean c = false;
        int digit1, digit2,  sum;
        while (i < len1 || j < len2 || c) {
            digit1 = i < len1 ? (int)num1.charAt(i)-'0' : 0;
            digit2 = j < len2 ? (int)num2.charAt(j)-'0' : 0;
            sum = c ? digit1 + digit2 + 1 :  digit1 + digit2;
            res.append(sum%2);
            c = sum > 1 ? true : false;
            i++;
            j++;
        }
        return res.reverse().toString();
    }
}
