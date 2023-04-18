package MergeStringsAlternately;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();
        boolean fromFirstWord = true;
        while (i < word1.length() && j < word2.length()) {
            if (fromFirstWord) {
                sb.append(word1.charAt(i++));
            } else {
                sb.append(word2.charAt(j++));
            }
            fromFirstWord = !fromFirstWord;
        }
        if (fromFirstWord) sb.append(word1.substring(i));
        else sb.append(word2.substring(j));

        return sb.toString();
    }
}
