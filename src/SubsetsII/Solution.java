package SubsetsII;

import java.util.*;

public class Solution {
    public List<List<Integer>> subsetsWithDupIter(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());


        Arrays.sort(nums);

        int i=0;
        while (i< nums.length) {
            int sz = res.size();

            int j=i+1;
            while (j< nums.length && nums[j]==nums[i])
                ++j;

            for (int k = 0; k < sz; k++) {

                List<Integer> temp = new ArrayList<>(res.get(k));
                for (int l = 1; l < j-i+1; l++) {
                    temp.add(nums[i]);
                    res.add(List.copyOf(temp));
                }
            }
            i=j;
        }
        return res;
    }
    private int[] nums;
    private List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums=nums;
        Arrays.sort(this.nums);
        res = new ArrayList<>();
        backtrack(0,new ArrayList<Integer>());
        return  res;
    }

    private void backtrack(int i, ArrayList<Integer> subset) {
        if (i>=nums.length) {
            res.add(List.copyOf(subset));
            return;
        }
        subset.add(nums[i]);
        backtrack(i+1,subset);
        subset.remove(subset.size()-1);
        while (i+1< nums.length && nums[i]==nums[i+1]) {
            ++i;
        }
        backtrack(i+1,subset);
    }
}
