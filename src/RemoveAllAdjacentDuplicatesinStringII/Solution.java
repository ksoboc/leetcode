package RemoveAllAdjacentDuplicatesinStringII;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s, int k) {


        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!charStack.isEmpty() && ch==charStack.peek()) {
                    var count = countStack.pop();
                    ++count;
                    countStack.push(count);
            } else {
                charStack.push(ch);
                countStack.push(1);
            }

            if (countStack.peek()==k) {
                countStack.pop();
                charStack.pop();
            }


        }
        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            var ch = charStack.pop() + "";
            var count = countStack.pop();
            sb.append(ch.repeat(count) );
        }
        return sb.reverse().toString();
    }
}
