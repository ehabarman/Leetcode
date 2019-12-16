package easy;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<Character, String> letter = new HashMap<>();
        HashMap<String, Character> word = new HashMap<>();
        int len = pattern.length();
        char current;

        if (len != words.length)
            return false;

        for (int i = 0; i < len; i++) {
            current = pattern.charAt(i);

            if (letter.containsKey(current) || word.containsKey(words[i])) {
                if (!letter.containsKey(current))
                    return false;
                if (!word.containsKey(words[i]))
                    return false;
                if( letter.get(current).compareTo(words[i]) != 0 || word.get(words[i]) != current )
                    return false;
            }
            else {
                letter.put(current, words[i]);
                word.put(words[i], current);
            }

        }

        return true;
    }
}
