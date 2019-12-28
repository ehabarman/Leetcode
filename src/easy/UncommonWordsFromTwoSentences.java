package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> count = new HashMap();
        for (String word: A.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        for (String word: B.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);

        List<String> ans = new ArrayList<>();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);

        return ans.toArray(new String[ans.size()]);
    }
}
