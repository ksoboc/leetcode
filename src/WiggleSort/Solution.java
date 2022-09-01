package WiggleSort;

public class Solution {
    public void wiggleSort(int[] nums) {
        // write your code here
        for (int i = 1; i < nums.length; i++) {
            if ((i % 2 == 0 && nums[i-1] < nums[i]) ||
                    (i % 2 == 1 && nums[i-1] > nums[i])) {
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = tmp;
            }

        }
    }

    public void wiggleSort2(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if ((i%2==1 && nums[i] < nums[i+1]) || (i%2==0 && nums[i]>nums[i+1])) {
                var tmp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = tmp;
            }

        }
    }
}
