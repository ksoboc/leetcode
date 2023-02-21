package AddtoArrayFormofInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int carry = k;
        int i = num.length - 1;
        while (i >= 0) {
            int sum = carry;
            sum += num[i];
            ans.add(sum % 10);
            carry = sum / 10;
            --i;
        }
        while (carry > 0) {
            ans.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
