package easy;

public class GoatLatin {
    public String toGoatLatin(String S) {
        String[] words = S.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (doesStartWithVowel(words[i])) {
                sb.append(words[i]);
            } else {
                sb.append(words[i].substring(1));
                sb.append(words[i].charAt(0));
            }

            sb.append("ma");
            appendAs(sb, i);
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public void appendAs(StringBuilder sb, int n) {
        for (int i = 0; i <= n; i++)
            sb.append("a");
    }

    public boolean doesStartWithVowel(String s) {
        char c = s.charAt(0);
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}