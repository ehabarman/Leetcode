package medium;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {

    public int myAtoi(String str) {
        String regex = "^\\s*[-+]?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(str);
        if (!match.find()) return 0;
        String number = match.group().trim();
        int sign = 1;
        if (number.startsWith("+")) {
            number = number.substring(1);
        }
        BigInteger input = new BigInteger(number);
        BigInteger max = new BigInteger(Integer.MAX_VALUE + "");
        BigInteger min = new BigInteger(Integer.MIN_VALUE + "");
        if(input.compareTo(max) > 0) return Integer.MAX_VALUE;
        if(input.compareTo(min) < 0) return Integer.MIN_VALUE;
        return input.intValue();
    }
}
