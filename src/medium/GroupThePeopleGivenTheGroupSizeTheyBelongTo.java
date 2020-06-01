package medium;

import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (groups.containsKey(groupSizes[i])) groups.get(groupSizes[i]).add(i);
            else {
                groups.put(groupSizes[i], new ArrayList<>());
                groups.get(groupSizes[i]).add(i);
            }
        }
        for (int size : groups.keySet()) {
            List<Integer> group = groups.get(size);
            int i = 0;
            while (i < group.size()) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < size; j++, i++)
                    temp.add(group.get(i));
                result.add(temp);
            }
        }

        return result;
    }
}
