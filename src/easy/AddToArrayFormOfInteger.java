package easy;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int i = A.length - 1;
        int temp, carry = 0;
        while (K > 0 || i >= 0 || carry != 0) {
            temp = 0;
            if (i >= 0)
                temp = A[i--];

            list.add(0, (temp + K % 10 + carry) % 10);
            carry = (temp + K % 10 + carry) / 10;
            K /= 10;

        }

        return list;
    }
}
