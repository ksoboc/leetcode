package ArrayWithElementsNotEqualtoAverageofNeighbors;

import java.util.Arrays;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];

        int k=0;
        for (int i = 0; i < nums.length; i+=2,++k) {
            res[i] = nums[k];
        }
        k= nums.length-1;
        for (int i = 1; i < nums.length; i+=2,--k) {
            res[i] = nums[k];
        }
        int l=0;
        int r=nums.length-1;
        int i=0;
        while (i< nums.length) {
            res[i] = nums[l];
            ++l; ++i;
            if (l<=r) {
                res[i]=nums[r];
                --r; ++i;
            }
        }
        return res;

    }
}
