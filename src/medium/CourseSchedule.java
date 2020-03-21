package medium;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int n, int[][] courses) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<courses.length; i++) {
            int[] course = courses[i];
            adj.get(course[0]).add(course[1]);
        }
        boolean[] visited = new boolean[n];
        boolean[] rec = new boolean[n];
        for(int i=0; i<n; i++) {
            if(adj.get(i) != null && isCyclic(adj, visited, rec, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(List<List<Integer>> adj, boolean[] visited, boolean[] rec, int i) {
        if(rec[i]) {
            return true;
        }

        if (visited[i]) {
            return false;
        }
        rec[i] = true;
        visited[i] = true;
        List<Integer> children = adj.get(i);
        for(int j=0; j<children.size(); j++) {
            if(isCyclic(adj, visited, rec, children.get(j))) {
                return false;
            }
        }
        rec[i] = false;
        return false;
    }
}
