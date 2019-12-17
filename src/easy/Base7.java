package easy;

public class Base7 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if( num < 0)
            return "-"+convertToBase7(-1*num);

        do{
            sb.append(num%7);
            num /= 7;
        }
        while(num != 0);
        return sb.reverse().toString();
    }
}
