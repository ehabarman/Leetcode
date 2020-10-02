package medium;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return canReach(arr, start, visited);
    }

    private boolean canReach(int[] arr, int current, boolean[] visited) {
        if (current < 0 || current >= arr.length) return false;
        if (visited[current]) return false;
        visited[current] = true;
        if (arr[current] == 0) return true;
        return canReach(arr, current + arr[current], visited) || canReach(arr, current - arr[current], visited);
    }

}
