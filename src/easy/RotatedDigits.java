package easy;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int ans = 0;
        for(int  i = 1 ; i <= N ; i++) {
            int n = i;
            boolean valid = true;
            int count = 0;
            while(n != 0) {
                int d = n % 10;
                if( d == 3 || d == 4 || d == 7) {
                    valid = false;
                    break;
                }
                if( d == 2 || d == 5 || d == 6 || d == 9) {
                    count++;
                }
                n /= 10;
            }
            if(!valid) continue;
            if(count > 0)  ans++;
        }
        return ans;
    }
}
