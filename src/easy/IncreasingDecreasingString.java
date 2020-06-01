package easy;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        int[] count = count(s);
        int l = 0, r = 26;
        int prev, lTemp, rTemp;
        StringBuilder sb = new StringBuilder();
        while (l <= r) {
            prev = -1;
            while (count[l] == 0 && l < 26) l++;
            while (count[r] == 0 && r > 0) r--;
            lTemp = l;
            while (lTemp <= r) {
                for (; lTemp <= r; lTemp++) {
                    if (count[lTemp] > 0 && lTemp != prev) {
                        prev = lTemp;
                        count[lTemp]--;
                        sb.append((char) (lTemp + 'a'));
                    }
                }
            }

            prev = -1;
            rTemp = r;
            while (rTemp >= l) {
                for (; rTemp >= l; rTemp--) {
                    if (count[rTemp] > 0 && rTemp != prev) {
                        prev = rTemp;
                        count[rTemp]--;
                        sb.append((char) (rTemp + 'a'));
                    }
                }
            }
        }
        return sb.toString();
    }

    public int[] count(String s) {
        int[] count = new int[27];
        for (char c : s.toCharArray())
            count[c - 'a']++;
        return count;
    }
}
