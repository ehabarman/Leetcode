package medium;

import java.util.List;

public class ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        TrieTree root = new TrieTree();
        for(String word : dict) root.addWord(word);
        StringBuilder ans = new StringBuilder();

        for (String word: sentence.split("\\s+")) {
            if (ans.length() > 0)
                ans.append(" ");

            String prefix = root.findFirstPrefix(word);
            ans.append(prefix.isEmpty()? word : prefix);
        }
        return ans.toString();
    }


    static class TrieTree{
        TrieTree[] children = new TrieTree[26];
        boolean isWord = false;

        public void addWord(String word) {
            if (word == null || word.isEmpty()) return;
            TrieTree current = this;
            int index;
            for(char c : word.toCharArray()) {
                index = c - 'a';
                if (current.children[index] == null)
                    current.children[index] = new TrieTree();
                current = current.children[index];
            }
            current.isWord = true;
        }

        public String findFirstPrefix(String word) {
            TrieTree cur = this;
            StringBuilder sb = new StringBuilder();
            int index;
            for (char letter: word.toCharArray()) {
                index = letter - 'a';
                if (cur.children[index] == null) return "";
                cur = cur.children[index];
                sb.append(letter);
                if (cur.isWord) break;
            }
            return sb.toString();
        }
    }
}
