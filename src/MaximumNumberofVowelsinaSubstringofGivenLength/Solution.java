package MaximumNumberofVowelsinaSubstringofGivenLength;

public class Solution {
    public int maxVowels(String s, int k) {
        int l = 0, r = 0;
        int maxVowels = 0;
        int countVowels = 0;
        while (r < s.length()) {
            if (r < k) {
                if (isVowel(s.charAt(r))) {
                    ++countVowels;
                }
                ++r;
            } else {
                if (isVowel(s.charAt(l)))
                    --countVowels;
                if (isVowel(s.charAt(r)))
                    ++countVowels;
                ++l;
                ++r;
            }
            maxVowels = Math.max(maxVowels, countVowels);
        }
        return maxVowels;
    }

    private boolean isVowel(char charAt) {
        return "aeiou".indexOf(charAt) >= 0;
    }
}
