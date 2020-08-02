package easy;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    private static String PUSH = "Push";
    private static String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int targetIndex = 0;
        int current = 1;
        int targetLen = target.length;
        while (targetIndex < targetLen) {
            result.add(PUSH);
            if (current == target[targetIndex]) {
                targetIndex++;
            }
            else {
                result.add(POP);
            }
            current++;
        }
        return result;
    }
}
