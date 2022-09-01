package SquaresofaSortedArray;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        var l = 0;
        var r = nums.length-1;
        var i = r;
        while (l<=r) {
            var lsquared = nums[l]*nums[l];
            var rsquared = nums[r]*nums[r];
            if (lsquared>rsquared) {
                res[i--] = lsquared;
                ++l;
            } else {
                res[i--] = rsquared;
                --r;
            }
        }
        return res;

    }
}
