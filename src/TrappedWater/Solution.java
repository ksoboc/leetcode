package TrappedWater;

import java.util.Stack;

public class Solution {
    public int trap(int[] height) {

        return 0;
    }

    public int trapDP(int[] height) {
        int ans = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for (var i = 1; i < height.length; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[height.length - 1] = height[height.length - 1];
        for (var i = height.length - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (var i = 0; i < height.length; ++i) {
            int amount = Math.min(leftMax[i], rightMax[i]) - height[i];

            if (amount > 0)
                ans += amount;
        }

        return ans;

    }

    public int trapStack(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int ans = 0;
        for (var current = 0; current < height.length; ++current) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                var distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current);
        }
        return ans;
    }

    public int trapTwoPointer(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] > leftMax) {
                    leftMax = height[left];
                }
                else {
                    ans += leftMax - height[left];
                }
                left++;
            }
            else {
                if(height[right] > rightMax) {
                    rightMax = height[right];
                }
                else {
                    ans += rightMax - height[right];
                }
                right--;
            }
        }
        return ans;
    }

    public int trapBF(int[] height) {

        int ans = 0;

        for (int i = 0; i < height.length; ++i) {
            int leftMax = 0;
            for (int j = i - 1; j >= 0; --j) {
                leftMax = Math.max(leftMax, height[j]);
            }

            var rightMax = 0;
            for (var j = i + 1; j < height.length; ++j) {
                rightMax = Math.max(rightMax, height[j]);
            }

            int amount = Math.min(leftMax, rightMax) - height[i];

            if (amount > 0)
                ans += amount;

        }

        return ans;
    }
}
