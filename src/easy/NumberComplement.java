package easy;

public class NumberComplement {
    public int findComplement(int num) {
        int result = 0, i = 0;
        while (num > 0) {
            result |= (num % 2 ^ 1) << i++;
            num /= 2;
        }
        return result;
    }
}
