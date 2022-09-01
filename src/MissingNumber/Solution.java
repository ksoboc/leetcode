package MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        var res=nums.length;
        for (var i=0;i<nums.length;++i) {
            res ^= i^nums[i];
        }
        return res;
    }

    public int missingNumberSum(int[] nums) {
        var sum1 = nums.length * (1+ nums.length)/2;
        var sum2 = 0;
        for (var num :
                nums) {
            sum2+=num;
        }
        return sum1-sum2;


    }

    public int missingNumberSum1(int[] nums) {
        var res=nums.length;
        for (var i=0;i<nums.length;++i) {
            res += i - nums[i];
        }
        return res;
    }
}
