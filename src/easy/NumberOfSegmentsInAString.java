package easy;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int count = 1;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') count++;
        return count;
    }
}
