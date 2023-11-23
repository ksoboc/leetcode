package ArithmeticSubarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int lb = l[i];
            int rb = r[i];

            if (rb - lb <= 0) {
                res.add(false);
                continue;
            }

            boolean isAritm = true;
            int[] arr = Arrays.copyOfRange(nums, lb, rb + 1);
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            for (int j = 2; j < arr.length; j++) {
                if (arr[j] - arr[j - 1] != diff) {
                    isAritm = false;
                    break;
                }
            }
            res.add(isAritm);
        }
        return res;
    }
}
