package LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Solution {

    private char[][] digitsToLettersArr = {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };

    private List<String> answer;
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return Collections.emptyList();

        answer=new ArrayList<>();
        letterCombinations(digits,0, new StringBuilder());
        return answer;
    }

    private void letterCombinations(String digits, int i, StringBuilder sb) {

        if (i>=digits.length()) {
            answer.add(sb.toString());
            return;
        }

        int idx = digits.charAt(i) - '2';
        for (var ch:digitsToLettersArr[idx]) {
            sb.append(ch);
            letterCombinations(digits,i+1,sb);
            sb.deleteCharAt(i);
        }
    }
}
