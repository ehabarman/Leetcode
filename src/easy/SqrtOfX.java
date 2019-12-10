package easy;

import java.util.Scanner;

public class SqrtOfX {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(mySqrt(n));
    }

    public static int mySqrt(int x) {
        if (x < 2)
            return x;

        long left = 1;
        long right = x;

        while (left < right) {
            long mid = (int) (left + Math.floor((right - left) / 2));
            long midSquare = mid * mid;
            if (midSquare == x)
                return (int) mid;
            else if (midSquare > x)
                right = mid;
            else
                left = mid + 1;
        }

        return (int)left - 1;
    }


}
