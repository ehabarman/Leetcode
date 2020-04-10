package easy;

public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        if(num_people == 1)
            return (new int[]{candies});
        int[] result = new int[num_people];
        int peopleToGetDesiredCandies = getPositiveFactor(candies);
        int rounds = peopleToGetDesiredCandies / num_people;
        if(rounds > 0) {
            int multiplier = (rounds * (rounds - 1)) / 2;
            for(int i = 0; i < num_people; i++) {
                result[i] = (multiplier * num_people) + ((i + 1) * rounds);
                candies -= result[i];
            }
        }
        int peopleIndex = 0;
        while(candies > 0) {
            int distCandies = (rounds * num_people) + (peopleIndex + 1);
            result[peopleIndex] += distCandies;
            candies -= distCandies;
            peopleIndex++;
        }
        if(candies < 0) {
            result[peopleIndex - 1] -= (0 - candies);
        }
        return result;
    }
    private int getPositiveFactor(double c) {
        int factor = (-1 + (int)Math.sqrt(1 - (-8 * c))) / 2;

        return factor;
    }
}
