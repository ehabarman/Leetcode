package easy;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        while (t < s.length()) {

            if (t + 2 < s.length() && s.charAt(t + 2) == '#') {
                String temp = Character.toString(s.charAt(t)) + Character.toString(s.charAt(t + 1));
                char ins = (char) ('a' + (Integer.parseInt(temp) - 1));
                sb.append(ins);

                t += 3;
            } else {
                sb.append((char) ('a' + Character.getNumericValue(s.charAt(t)) - 1));
                t++;
            }
        }
        return sb.toString();
    }
}
