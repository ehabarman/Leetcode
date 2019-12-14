package easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> store;
    private int size;

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        store = new LinkedList<>();
        size = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> tmp = new LinkedList<>();
        tmp.add(x);
        while ( ! store.isEmpty() )
            tmp.add(store.poll());
        store = tmp;
        ++size;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()) return -1;
        --size;
        return store.poll();
    }

    /** Get the top element. */
    public int top() {
        if (empty()) return -1;
        return store.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}
