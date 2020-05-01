package easy;

import java.util.Stack;

public class ReformatTheString {
    public String reformat(String s) {
        int n = s.length();
        Stack<Character> letters = new Stack<>();
        Stack<Character> numbers = new Stack<>();
        for (char c : s.toCharArray())
            if (c >= 'a')
                letters.push(c);
            else
                numbers.push(c);
        if (Math.abs(letters.size() - numbers.size()) > 1) return "";
        if(letters.size() > numbers.size()) return helper(letters, numbers, n);
        else return helper(numbers, letters, n);
    }

    public String helper(Stack<Character> first, Stack<Character> second, int n){
        StringBuilder sb = new StringBuilder(n);
        while (!(first.empty() && second.empty())) {
            if (!first.empty()) sb.append(first.pop());
            if (!second.empty()) sb.append(second.pop());
        }
        return sb.toString();
    }
}
