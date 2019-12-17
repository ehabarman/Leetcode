package easy;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] s = new char[S.length()];
        char[] t = new char[T.length()];
        int sSize = 0, tSize = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#')
                s[sSize++] = S.charAt(i);
            else
                sSize = Math.max(0, --sSize);
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#')
                t[tSize++] = T.charAt(i);
            else
                tSize = Math.max(0, --tSize);
        }

        if (tSize != sSize)
            return false;

        for (int i = 0; i < tSize; i++)
            if(s[i] != t[i])
                return false;

        return true;
    }
}
