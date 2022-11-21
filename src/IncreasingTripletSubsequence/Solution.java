package IncreasingTripletSubsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
        for (var num : nums) {
            if (num <= num1) { // Equal sign is important
                num1 = num;
            } else if (num <= num2) { // Equal sign is important
                num2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
