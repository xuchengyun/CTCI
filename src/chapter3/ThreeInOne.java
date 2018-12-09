package chapter3;

public class ThreeInOne {
    // Fixed division
    class FixedMultiStack1 {
        private int numOfStacks = 3;
        private int stackCapacity;
        private int[] values;
        private int[] sizes;

        public FixedMultiStack1(int stackSize) {
            stackCapacity = stackSize;
            values = new int[numOfStacks * stackCapacity];
            sizes = new int[numOfStacks];
        }

        // push to the top of stack
        public void push(int val, int stackNum) {
            if (isFull(stackNum)) throw new RuntimeException();
            sizes[stackNum]++;
            values[indexTop(stackNum)] = val;
        }

        public int pop(int stackNum) {
            if (isEmpty(stackNum)) throw new RuntimeException();
            int val = values[indexTop(stackNum)];
            values[indexTop(stackNum)] = 0;
            sizes[stackNum]--;
            return val;
        }

        public int peek(int stackNum) {
            if (isEmpty(stackNum)) throw new RuntimeException();
            return values[indexTop(stackNum)];
        }

        public boolean isFull(int stackNum) {
            return sizes[stackNum] == stackCapacity)
        }

        public int indexTop(int stackNum) {
            return stackNum * stackCapacity + sizes[stackNum] - 1;
        }

        public boolean isEmpty(int stackNum) {
            return sizes[stackNum] == 0;
        }
    }
}
