package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num=0;
        for(int i=0; i<A.length; i++)
        {
            num = (num*2 + A[i])%5;
            list.add(num==0);
        }
        return list;
    }
}
