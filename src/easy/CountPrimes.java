package easy;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] seivePrimes = new boolean[n+1];
        int count = 0;
        for(int i = 2; i <=n ; i++){
            if(! seivePrimes[i]){
                count++;
                int j = i;
                while(j<=n){
                    seivePrimes[j]=true;
                    j+=i;
                }
            }
        }
        return count;
    }
}
