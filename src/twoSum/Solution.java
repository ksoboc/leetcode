package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();


        for (int i=0;i< nums.length;++i) {
            int rest = nums[i];
            if (map.containsKey(rest)) {
                return new int[]{map.get(rest),i};
            }
            map.put(target-nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.twoSum(new int[]{2,7,11,15}, 9);

        System.out.println("ans = " + Arrays.stream(ans).boxed().collect(Collectors.toList()));

        ans = sol.twoSum(new int[]{3,2,4}, 6);

        System.out.println("ans = " + Arrays.stream(ans).boxed().collect(Collectors.toList()));
    }
}
