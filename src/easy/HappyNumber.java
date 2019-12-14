package easy;

import java.util.HashSet;

public class HappyNumber {
    HashSet<Integer> set = new HashSet<Integer>();

    public boolean isHappy(int n) {
        return isHappyNow(n);
    }

    public boolean isHappyNow(int n) {
        if (n == 1) return true;
        if (set.contains(n)) return false;
        set.add(n);
        String temp = String.valueOf(n);

        int sum = 0;
        for (char c : temp.toCharArray()) {
            int each = Integer.valueOf(c + "");
            sum += each * each;
        }
        return isHappyNow(sum);
    }
}
