package easy;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if( c <= 1) return true;
        int low = (int) Math.sqrt(c);
        int sum;
        for(int i = 1; i <= low ; i++)
            for(int j = i; j <= low; j++)
            {
                sum =  i*i + j*j;
                if( sum == c)
                    return true;
                else if( sum > c)
                    break;
            }
        return false;
    }
}
