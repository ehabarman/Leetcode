package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> freq = new HashMap<>();
        Set<String> bannedWords = new HashSet<>();
        for (String bannedWord : banned) bannedWords.add(bannedWord);
        String searchPattern = "\\w+";
        Pattern pattern = Pattern.compile(searchPattern);
        Matcher matcher = pattern.matcher(paragraph);
        while (matcher.find()) {
            String word = matcher.group(0).toLowerCase();
            if (bannedWords.contains(word)) continue;
            if (freq.containsKey(word)) freq.put(word, freq.get(word) + 1);
            else freq.put(word, 1);
        }
        int max = 0;
        String mostCommon = "";
        for (String key : freq.keySet())
            if (freq.get(key) > max) {
                max = freq.get(key);
                mostCommon = key;
            }
        return mostCommon;
    }
}
