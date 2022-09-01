package MajorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
        var res = 0;
        var count = 0;

        for (var n : nums) {
            if (count == 0)
                res = n;
            count += n == res ? 1 : -1;
        }
        return res;

    }
}
