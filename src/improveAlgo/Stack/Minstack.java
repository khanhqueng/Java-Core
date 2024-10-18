package improveAlgo.Stack;

import java.util.ArrayList;
import java.util.List;

public class Minstack {
    class MinStack {
        List<int[]> stack ;
        public MinStack() {
            stack = new ArrayList<>();
        }

        public void push(int val) {
            int[] top = stack.isEmpty() ? new int[]{val, val} : new int[]{val, Math.min(val, stack.getLast()[1])};
            stack.add(top);
        }

        public void pop() {
            stack.removeLast();
        }

        public int top() {
            return stack.getLast()[0];
        }

        public int getMin() {
            return stack.isEmpty() ? -1 : stack.getLast()[0];
        }
    }
}
