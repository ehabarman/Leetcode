package easy;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 0;
        int count = 0;
        char previous = '#';
        for(char c : s.toCharArray()) {
            if ( c == previous) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
                previous = c;
            }
        }
        return max;
    }
}
