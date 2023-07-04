package SingleNumberII;

public class Solution {
    public int singleNumber(int[] nums) {
        int once = 0, twice = 0;

        for (var num : nums) {
            once = (~twice) & (once ^ num);
            twice = (~once) & (twice ^ num);
        }
        return once;
    }
}
