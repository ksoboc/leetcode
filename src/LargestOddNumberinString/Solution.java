package LargestOddNumberinString;

public class Solution {
    public String largestOddNumber(String num) {

        for (int r = num.length() - 1; r >= 0; r--) {
            if (((num.charAt(r) - '0') & 1) == 1) {
                return num.substring(0, r + 1);

            }
        }
        return "";
    }
}
