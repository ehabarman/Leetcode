package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = IntStream.of(arr).sum();
        if(sum%2 != 0) return false;
        sum /= 2;
        boolean [][] dp = new boolean[n][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }
        // PreFill values when Index dp[0][ if (arr[element] == sum)] i.e. updating first row in dp matrix
        for(int s=1;s<=sum;s++){
            dp[0][s] = (arr[0]==sum ? true:false);
        }

        // Now filling dp matrix using prefilled values
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                // if upper element from current postion is having value we are updating same
                if(dp[i-1][j]){
                    dp[i][j] = dp[i-1][j];
                }
                // if not getting any subset to fill then using below condition
                else if(j >= arr[i]){
                    dp[i][j] = dp[i-1][j-arr[i]];
                }
            }
        }
        // returning bottom right most value
        return dp[n-1][sum];
    }

}
