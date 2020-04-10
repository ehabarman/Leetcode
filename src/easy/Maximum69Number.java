package easy;

public class Maximum69Number {
    public int maximum69Number (int num) {
        StringBuilder number = new StringBuilder(num + "");
        int sixIndex = number.indexOf("6");
        if(sixIndex == -1) return num;
        number.setCharAt(sixIndex, '9');
        return Integer.parseInt(number.toString());
    }
}
