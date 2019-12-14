package easy;

import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    public MinStack() {

    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        if(list.size() != 0)
            list.remove(list.size()-1);
    }

    public int top() {
        if(list.size() == 0)
            return Integer.parseInt(null);

        return list.get(list.size()-1);

    }

    public int getMin() {
        if(list.size() == 0)
            return Integer.parseInt(null);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size();  i++)
            min = Math.min(min, list.get(i));
        return  min;
    }
}
