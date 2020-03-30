package easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] letters = new int[26];
        int count, temp;
        for(char c = 'a'; c <= 'z'; c++){
            count = Integer.MAX_VALUE;
            for(String word: A){
                temp = 0;
                for(int i=0; i < word.length(); i++) {
                    if(c == word.charAt(i)){
                        temp++;
                    }
                }
                count = Math.min(count, temp);
            }
            letters[c-'a'] = count;
        }

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < letters[i]; j++){
                result.add("" + (char)('a' + i));
            }
        }

        return result;
    }
}
