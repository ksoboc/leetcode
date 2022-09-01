package RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int romanCharToInt(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        var res = 0;
        for (var i = 0; i < s.length(); ++i) {
            if (i < s.length() - 1 && romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i + 1))) {
                res -= romanCharToInt(s.charAt(i));
            } else {
                res += romanCharToInt(s.charAt(i));
            }
        }
        return res;

    }
}
