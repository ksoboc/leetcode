package AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int digitSum = carry;
            if (i >= 0) {
                digitSum += Character.getNumericValue(a.charAt(i));
                i--;
            }
            if (j >= 0) {
                digitSum += Character.getNumericValue(b.charAt(j));
                j--;
            }
            result.append(digitSum & 1);
            carry = digitSum >> 1;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}

