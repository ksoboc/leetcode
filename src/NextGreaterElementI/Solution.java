package NextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1idx = new HashMap<>();
        for (var i=0;i<nums1.length;++i) {
            nums1idx.put(nums1[i],i);
        }
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        for (var i=0;i<nums2.length;++i) {
            var cur = nums2[i];
            while (!stack.isEmpty() && stack.peek()<cur) {
                var value = stack.pop();
                res[nums1idx.get(value)] = cur;
            }
            if (nums1idx.containsKey(cur)) {
                stack.add(cur);
            }
        }

        while (!stack.isEmpty()) {
            var value = stack.pop();
            res[nums1idx.get(value)] = -1;
        }

        return res;

    }
}
