package chapter3;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
    ArrayList<Stack<Integer>> stacks = new ArrayList<>();
    int capacity = 5;

    public void push(int val) {
        Stack<Integer> last = getLastStack();
        if (last != null && !(last.size() == capacity)) {
            last.push(val);
        } else {
            Stack newStack = new Stack();
            stacks.add(newStack);
            newStack.push(val);
        }
    }

    public int pop() {
        Stack last = getLastStack();
        if (last == null) throw new RuntimeException();
        int res = (Integer)last.pop();
        if (last.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }
        return res;
    }

    public Stack getLastStack() {
        if (stacks.size() == 0) throw new RuntimeException();
        return stacks.get(stacks.size() - 1);
    }
}
