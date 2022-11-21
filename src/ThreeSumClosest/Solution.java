package ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = target;
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (j==i+1 || nums[j]!=nums[j-1]) {
                        int sum = target - (nums[i] + nums[j]);
                        int pos = Arrays.binarySearch(nums, j + 1, nums.length, sum);
                        if (pos > j) {
                            return target;
                         } else {
                            int insPoint = -(pos+1);

                            int threeSum=0;
                            int diff1 = insPoint>j+1 ? Math.abs(target - (nums[i]+nums[insPoint-1]+nums[j])) : Integer.MAX_VALUE;
                            int diff2 = insPoint<nums.length ?  Math.abs(target - (nums[i]+nums[insPoint]+nums[j])) : Integer.MAX_VALUE;
                            int diff;

                            if ( diff1<diff2) {
                                threeSum=nums[i] + nums[insPoint - 1] + nums[j];
                                diff = Math.abs(target - threeSum);
                            } else  {
                                threeSum=nums[i]+nums[insPoint]+nums[j];
                                diff = Math.abs(target - threeSum);
                            }
                            if (diff<=minDiff) {
                                minDiff=diff;
                                res=threeSum;
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
