package FindUniqueBinaryString;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String findDifferentBinaryString2(String[] nums) {
        Set<Integer> set = new HashSet<>();

        for (var num:nums) {
            int n = Integer.parseInt(num,2);
            set.add(n);
        }

        int l = nums[0].length();
        for (int i = 0; i < 1 << l; i++) {
            if (!set.contains(i)) {
                var s = String.format("%0" + l + "s", Integer.toBinaryString(i));
                return s.replace(' ', '0');
            }

        }
        return "";
    }

    Set<String> set = new HashSet<>();
    int n;
    public String findDifferentBinaryString(String[] nums) {


        for (var num:nums) {

            set.add(num);
        }
        n=nums.length;
        return backtrack(0, "0".repeat(nums[0].length()));
    }

    private String backtrack(int i, String cur) {
        if (i==n) {
            return set.contains(cur) ? null : cur;
        }
        String res = backtrack(i+1,cur);
        if (res!=null)
            return res;
        return backtrack(i+1, cur.substring(0,i) + "1" + cur.substring(i+1));
    }

}
