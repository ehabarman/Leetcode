package easy;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++)
            result.add(candies[i] + extraCandies >= max);

        return result;
    }


    public int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        int prev = 1000001;
        for(int num: A) {
            if(num < 1 || num == prev) continue;
            if(min == num) min++;
            else break;
        }
        return min;
    }
}
