package medium;

public class ImplementTrie {

    ImplementTrie[] letters;
    boolean isWord;

    /**
     * Initialize your data structure here.
     */
    public ImplementTrie() {
        this.letters = new ImplementTrie[26];
        this.isWord = false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        ImplementTrie current = this;
        for (char c : word.toCharArray()) {
            if( current.letters[c - 'a'] == null) {
                current.letters[c - 'a'] = new ImplementTrie();
            }
            current = current.letters[c - 'a'];
        }
        current.isWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        ImplementTrie current = this;
        for (char c : word.toCharArray()) {
            if (current.letters[c - 'a'] == null) {
                return false;
            }
            current = current.letters[c - 'a'];
        }
        return current.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        ImplementTrie current = this;
        for (char c : prefix.toCharArray()) {
            if (current.letters[c - 'a'] == null) {
                return false;
            }
            current = current.letters[c - 'a'];
        }
        return true;
    }

}
