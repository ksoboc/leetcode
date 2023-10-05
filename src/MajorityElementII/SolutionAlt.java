package MajorityElementII;

import java.util.*;

public class SolutionAlt {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length == 1)
            return List.of(nums[0]);

        int cand1 = nums[0];
        int cand2 = nums[1];

        int count1 = 0;
        int count2 = 0;


        for (var n : nums) {
            if (n == cand1) {
                ++count1;
            } else if (n == cand2) {
                ++count2;
            } else if (count1 == 0) {
                cand1 = n;
                ++count1;
            } else if (count2 == 0) {
                cand2 = n;
                ++count2;
            } else {
                --count1;
                --count2;
            }
        }
        int nthird = nums.length / 3;
        count1 = 0;
        count2 = 0;
        for (var n : nums) {
            if (n == cand1) {
                ++count1;
            } else if (n == cand2) {
                ++count2;
            }

        }
        List<Integer> res = new ArrayList<>();
        if (count1 > nthird)
            res.add(cand1);
        if (count2 > nthird)
            res.add(cand2);

        return res;
    }
}
