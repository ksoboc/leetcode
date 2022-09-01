package PlusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;

        while (carry > 0) {
            if (i >= 0) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    carry = 0;
                }
            } else {
                int[] dig2 = new int[digits.length + 1];
                dig2[0] = 1;
                carry = 0;
                System.arraycopy(digits,0,dig2,1,digits.length);

                digits = dig2;
            }
            --i;
        }
        return digits;

    }
}
