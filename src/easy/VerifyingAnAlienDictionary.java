package easy;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        short[] lex = new short[256];
        short i = 1;
        for (char c : order.toCharArray()) lex[c] = i++;
        for (i = 0; i < words.length - 1; ++i) {
            String word1 = words[i];
            String word2 = words[i + 1];
            boolean b = false;
            for (int k = 0; k < Math.min(word1.length(), word2.length()); ++k) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    if (lex[word1.charAt(k)] > lex[word2.charAt(k)])
                        return false;
                    b = true;
                    break;
                }
            }
            if (b) continue;
            if (word1.length() > word2.length())
                return false;
        }
        return true;
    }
}
