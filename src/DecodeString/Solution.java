package DecodeString;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i,i+1);
            if (!ch.equals("]"))
                stack.push(ch);
            else {
                StringBuilder substring = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    substring = new StringBuilder(stack.pop()).append(substring);
                }
                stack.pop();
                StringBuilder k = new StringBuilder();
                while (!stack.isEmpty() && stack.peek().length()==1 && Character.isDigit(stack.peek().charAt(0))) {
                    k = new StringBuilder(stack.pop()).append(k);
                }
                String str = substring.toString().repeat(Integer.parseInt(k.toString()));
                stack.push(str);
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb = new StringBuilder(stack.pop()).append(sb);
        }

        return sb.toString();

    }
}
