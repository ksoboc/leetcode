package Pattern132;

import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> monoDecreasingStack = new Stack<>();
        Stack<Integer> minLeftStack = new Stack<>();

        var minL = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (!monoDecreasingStack.isEmpty() && nums[i]>=monoDecreasingStack.peek()) {
                monoDecreasingStack.pop();
                minLeftStack.pop();
            }

            if (!monoDecreasingStack.isEmpty() && minLeftStack.peek()<nums[i])
                return true;

            monoDecreasingStack.push(nums[i]);
            minLeftStack.push(minL);
            minL = Math.min(minL, nums[i]);

        }
        return false;
    }
}
