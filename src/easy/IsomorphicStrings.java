package easy;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (!charMap.containsKey(s.charAt(i)) && charMap.containsValue(t.charAt(i))) {
                return false;
            }
            if (!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i))) {
                charMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

