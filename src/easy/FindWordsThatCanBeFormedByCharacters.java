package easy;

import java.util.Arrays;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        if(words == null || words.length == 0 ||
                chars == null || chars.length() == 0) {
            return 0;
        }

        char[] sortedChars = toSortedChars(chars);
        int count = 0;
        for(String word : words) {
            char[] wchars = toSortedChars(word);
            if(wchars.length > sortedChars.length) {
                continue;
            }
            int j = 0;
            boolean match = false;
            for(int i = 0; i < wchars.length; i++) {
                while(j < sortedChars.length) {
                    if (wchars[i] == sortedChars[j]) {
                        if (i == wchars.length-1) {
                            match = true;
                        }
                        j++;
                        break;
                    }
                    else {
                        j++;
                    }
                }
                if(match) break;
            }
            if (match) {
                count += wchars.length;
            }
        }
        return count;
    }
    private char[] toSortedChars(String str) {
        char[] carray = str.toCharArray();
        Arrays.sort(carray);
        return carray;
    }
}
