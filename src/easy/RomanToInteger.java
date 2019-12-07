package easy;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        System.out.println(romanToInt(num));
    }

    public static int romanToInt(String s) {
        int res = 0, i=0, current=1, next=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(; i < s.length(); i++){
            current = map.get(s.charAt(i));

            if( i < s.length() - 1)
            {
                next = map.get(s.charAt(i+1));
                if(current >= next){
                    res += current;
                }
                else{
                    i++;
                    res += next - current;
                }
            }
            else{
                res += current;
            }
        }
        return res;
    }
}
