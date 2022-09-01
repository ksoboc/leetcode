package JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        var goal = nums.length - 1;

        for (var i = nums.length - 1; i >= 0; --i) {
            if (i + nums[i] >= goal)
                goal = i;
        }

        return goal == 0;

    }

}
