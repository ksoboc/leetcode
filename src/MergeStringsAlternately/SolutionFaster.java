package MergeStringsAlternately;

public class SolutionFaster {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        char[] chars1=word1.toCharArray();
        char[] chars2=word2.toCharArray();

        StringBuilder result = new StringBuilder();
        int i = 0;
        int l = Math.max(word1.length(),word2.length());

        while (i < l) {
            if (i < m) {
                result.append(chars1[i]);
            }
            if (i < n) {
                result.append(chars2[i]);
            }
            ++i;
        }

        return result.toString();
    }
}
