package medium;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public int minSteps(String s, String t) {
        int[] sCount = countLetters(s);
        int[] tCount = countLetters(t);
        int diff = 0;
        for(int i = 0; i < 26; i++) {
            diff += Math.abs(sCount[i] - tCount[i]);
        }
        return (diff / 2) + (diff % 2);
    }

    private int[] countLetters(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()) {
            count[c-'a']++;
        }
        return count;
    }
}
