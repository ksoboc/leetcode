package BasicCalculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int calculate(String s) {
        Deque<Integer> nums = new ArrayDeque<>();
        int answer = 0;
        int current_val = 0, sign = 1;


        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                current_val = 10 * current_val + c - '0';
            } else if (c == '+') {
                answer += current_val * sign;
                current_val = 0;
                sign = 1;
            } else if (c == '-') {
                answer += current_val * sign;
                current_val = 0;
                sign = -1;
            } else if (c == '(') {
                nums.push(answer);
                nums.push(sign);
                answer = 0;
                sign = 1;
            } else if (c == ')') {
                answer += current_val * sign;
                current_val = 0;

                answer = answer * nums.pop();

                answer = answer + nums.pop();

            }
        }
        answer += current_val * sign;
        return answer;

    }
}
