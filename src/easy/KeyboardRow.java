package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();
        Collections.addAll(row1, 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P');
        Collections.addAll(row2, 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L');
        Collections.addAll(row3, 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M');

        ArrayList<String> list = new ArrayList<>();
        int j, len;
        failed:
        for (int i = 0; i < words.length; i++) {
            j = 0;
            len = words[i].length();
            for (; j < len; j++)
                if (!row1.contains(words[i].charAt(j)))
                    if (j != 0) continue failed;
                    else break;
            for (; j < len; j++)
                if (!row2.contains(words[i].charAt(j)))
                    if (j != 0) continue failed;
                    else break;
            for (; j < len; j++)
                if (!row3.contains(words[i].charAt(j)))
                    if (j != 0) continue failed;
                    else break;
            if (j == len)
                list.add(words[i]);
        }
        String[] ans = new String[list.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = list.get(i);
        return ans;
    }
}
