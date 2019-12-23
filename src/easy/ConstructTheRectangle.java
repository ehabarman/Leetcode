package easy;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        if (area == 0)
            return new int[0];

        int[] ans = new int[2];
        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                ans[0] = area / i;
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
