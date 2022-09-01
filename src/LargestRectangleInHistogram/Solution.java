package LargestRectangleInHistogram;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> indexStack = new Stack<>();
        Stack<Integer> heightStack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!heightStack.isEmpty() && heightStack.peek()>heights[i]) {
                int h = heightStack.pop();
                int index = indexStack.pop();
                maxArea = Math.max(maxArea, (i-index)*h);
                start=index;
            }
            heightStack.push(heights[i]);
            indexStack.push(start);

        }

        while (!heightStack.isEmpty()) {
            int h = heightStack.pop();
            int index = indexStack.pop();
            maxArea = Math.max(maxArea, (heights.length-index)*h);
        }


        return maxArea;

    }
}
