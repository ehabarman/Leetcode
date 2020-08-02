package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Boolean> appeared = new HashMap<>();
        for (int i = 0; i < s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (appeared.containsKey(sub)) appeared.put(sub, true);
            else appeared.put(sub, false);
        }
        List<String> result = new ArrayList<>();
        appeared.forEach((K, V) -> { if (V) result.add(K); });
        return result;
    }
}
