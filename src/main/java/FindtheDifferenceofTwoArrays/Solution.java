package FindtheDifferenceofTwoArrays;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(onlyInFirst(nums1, nums2), onlyInFirst(nums2, nums1));

    }

    private List<Integer> onlyInFirst(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();

        for (var num : nums2) {
            set2.add(num);
        }
        Set<Integer> set1 = new HashSet<>();

        for (var num : nums1) {
            if (!set2.contains(num))
                set1.add(num);
        }

        return List.copyOf(set1);
    }
}
