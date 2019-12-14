package easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stack;
    Stack<Integer> auxStack;

    public ImplementQueueUsingStacks() {
        stack = new Stack<Integer>();
        auxStack = new Stack<Integer>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!stack.empty()) {
            int item = stack.pop();
            auxStack.push(item);
        }
        int item = auxStack.pop();
        while (!auxStack.empty()) {
            int elem = auxStack.pop();
            stack.push(elem);
        }
        return item;

    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!stack.empty()) {
            int item = stack.pop();
            auxStack.push(item);
        }
        int top = auxStack.peek();
        while (!auxStack.empty()) {
            stack.push(auxStack.pop());
        }
        return top;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.empty();
    }
}
