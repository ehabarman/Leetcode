package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(0);
        dfs(ans, res, graph.length - 1, 0, graph);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> res, int target, int source, int[][] graph) {
        if (target == source) {
            ans.add(new ArrayList<>(res));
            return;
        }

        for (int nei : graph[source]) {
            res.add(nei);
            dfs(ans, res, target, nei, graph);
            res.remove(res.size() - 1);
        }

    }
}
