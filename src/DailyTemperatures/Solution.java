package DailyTemperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                var t = stack.pop();
                res[t[1]] = i - t[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
