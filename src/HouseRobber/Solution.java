package HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        // [1..rob1 rob2 n n+1 ...]
        var rob1 = 0;
        var rob2 = 0;

        for (var i=0;i<nums.length;++i) {
            var temp = Math.max(nums[i]+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;

    }
}
