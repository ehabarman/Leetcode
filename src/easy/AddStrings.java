package easy;


import java.util.Scanner;

public class AddStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num1 = s.nextLine();
        String num2 = s.nextLine();

        System.out.println(addStrings(num1, num2));

    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0, digitSum;
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            digitSum = n1 >= 0 ? num1.charAt(n1) - '0' : 0;
            digitSum += n2 >= 0 ? num2.charAt(n2) - '0' : 0;
            digitSum += carry;
            result.insert(0, digitSum % 10);
            carry = digitSum / 10;
            n1--;
            n2--;
        }
        return result.toString();
    }
}
