package medium;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int count = 0;
        int add = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                if (count == 0) {
                    add++;
                } else {
                    count--;
                }
            }
        }
        return count + add;
    }
}
