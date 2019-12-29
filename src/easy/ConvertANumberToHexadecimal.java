package easy;

public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        int temp;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            temp = num & 0xf;
            num >>= 4;
            sb.append(map[temp]);
        }
        String result = sb.reverse().toString().replaceAll("^0+", "");
        return result;
    }
}
