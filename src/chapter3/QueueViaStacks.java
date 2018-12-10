package chapter3;

import java.util.Stack;

public class QueueViaStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueViaStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            moveElement();
        }
        return stack2.pop();
    }

    public void moveElement() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int peek() {
        if (stack2.isEmpty()) {
            moveElement();
        }
        return stack2.peek();
    }
}
