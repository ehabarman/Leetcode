package easy;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] m = new int[60];

        for(int i = 0; i < time.length; i++)
            m[time[i] % 60]++;

        int num = (m[0]*(m[0]-1))/2;
        num = num + (m[30]*(m[30]-1))/2;
        int i = 1;
        int j = 59;
        while(i<j){
            num = num + (m[i++]*m[j--]);
        }
        return num;
    }
}
