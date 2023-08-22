package ExcelSheetColumnTitle;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String convertToTitle(int columnNumber) {
        final int base = 26;
        Deque<Character> stack = new ArrayDeque<>();
        do {
            --columnNumber;
            char letter;
            letter = (char) ('A' + columnNumber % base );

            stack.push(letter);
            columnNumber /= base;
        } while (columnNumber > 0);

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
