package easy;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n - 1; i++) sb.append('a');
        if (n % 2 == 1) sb.append('a');
        else sb.append('b');
        return sb.toString();
    }
}
