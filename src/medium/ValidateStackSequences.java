package medium;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for(int value : pushed) {
            stack.push(value);
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return i == pushed.length;
    }
}
