package easy;


public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licensePlateCount = charsCount(licensePlate);
        int len = Integer.MAX_VALUE;
        String result = "";
        boolean foundFirst = false;
        for (String word : words) {
            if (foundFirst && word.length() >= len) continue;
            int[] wordCount = charsCount(word);
            if (isCompleting(wordCount, licensePlateCount)) {
                len = word.length();
                result = word;
                foundFirst = true;
            }

        }
        return result;
    }

    public boolean isCompleting(int[] wordCount, int[] licensePlateCount) {
        for (int i = 0; i < 27; i++)
            if (licensePlateCount[i] > wordCount[i]) return false;
        return true;
    }

    public int[] charsCount(String s) {
        int[] count = new int[27];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                count[c - 'a']++;
            else if (c >= 'A' && c <= 'X')
                count[c - 'A']++;
        }
        return count;
    }
}
