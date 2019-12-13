package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex < 0)
            return result;
        else if(rowIndex == 0) {
            result.add(1);
            return result;
        } else {
            result.add(1);
            result.add(1);
            if(rowIndex == 1)
                return result;

            rowIndex--;
            while(rowIndex-- > 0) {
                result = getNextRow(result);
            }
            return result;
        }
    }

    private List<Integer> getNextRow(List<Integer> row) {
        List<Integer> nextRow = new ArrayList<>();
        nextRow.add(1);
        int l = row.size();
        for(int i = 0; i < l - 1; i++)
            nextRow.add(row.get(i) + row.get(i + 1));
        nextRow.add(1);
        return nextRow;
    }
}
