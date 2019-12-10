package easy;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(climbStairs(n));

    }
    public static int climbStairs(int n) {
        int a = 1;
        int b = 2;

        if( n <= 2)
            return n;

        n -= 2;
        int temp;

        while( n-- > 0){
            temp = b;
            b += a;
            a = temp;
        }

        return b;
    }
}
