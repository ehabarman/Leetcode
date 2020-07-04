package medium;

public class CountNumberOfTeams {

    public int numTeams(int[] rating) {
        int count = 0;
        int len = rating.length;
        for (int i = 0; i < len - 2; i++)
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++)
                    if ((rating[i] > rating[j] && rating[j] > rating[k]) || (rating[i] < rating[j] && rating[j] < rating[k]) )
                        count++;
        return count;
    }
}
