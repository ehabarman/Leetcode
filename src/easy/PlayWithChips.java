package easy;

public class PlayWithChips {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0;
        for (int chip : chips)
            odd += (chip & 1);
        return Math.min(odd, chips.length - odd);
    }
}
