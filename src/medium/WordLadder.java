package medium;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        String[] words = new String[10];
        Arrays.asList(words);
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> set = new HashSet();
        set.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int z = 0; z < size; z++) {
                String currentWord = queue.poll();

                for (int i = 0; i < currentWord.length(); i++) {
                    char[] arr = currentWord.toCharArray();

                    for (char a = 'a'; a <= 'z'; a++) {
                        arr[i] = a;

                        String newWord = new String(arr);

                        if (dict.contains(newWord) && newWord.equals(endWord)) {
                            return level + 1;
                        }

                        if (dict.contains(newWord) && !set.contains(newWord)) {
                            queue.add(newWord);
                            set.add(newWord);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
