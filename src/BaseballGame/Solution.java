package BaseballGame;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op:ops) {
            if (op.equals("+")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2);
                stack.push(op1);
                stack.push(op1+op2);

            } else if (op.equals("D")) {
                int op1 = stack.pop();
                stack.push(op1);
                stack.push(2*op1);

            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }

        }
        int sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();
        return sum;
    }
}
