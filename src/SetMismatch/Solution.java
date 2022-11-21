package SetMismatch;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        int rep=0;
        for (var num:nums) {
            if (set.contains(num)) {
                rep=num;
            }
            set.add(num);
            sum+=num;
        }
        int diff = (nums.length + 1)* nums.length/2 - sum;
        return new int[]{rep,rep+diff};
    }
}
