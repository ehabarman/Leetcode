package easy;


public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] candidates = new int[N + 1];
        candidates[0] = -1;
        for (int i = 0; i < trust.length; i++)
            candidates[trust[i][0]] = -1;
        int candidate = -1;
        for (int i = 1; i < N + 1; i++) {
            if (candidates[i] == 0) {
                candidate = i;
                break;
            }
        }
        if (candidate == -1)
            return -1;
        int count = 0;
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][1] == candidate)
                count++;
        }
        if (count == N - 1)
            return candidate;

        return -1;
    }
}
