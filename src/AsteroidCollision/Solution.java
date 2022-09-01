package AsteroidCollision;

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (var a:asteroids
             ) {
            while (!stack.isEmpty() && stack.peek()>0 && a<0) {
                var diff = stack.peek() + a;
                if (diff<0) {
                    stack.pop();
                } else if (diff>0) {
                    a=0;
                } else {
                    stack.pop();
                    a=0;
                }
            }
            if (a!=0)
                stack.push(a);
        }

        int n = stack.size();
        int[] res = new int[n];
        for (int i = n-1; i >= 0; i--) {
            res[i] = stack.pop();

        }
        return res;

    }
}
