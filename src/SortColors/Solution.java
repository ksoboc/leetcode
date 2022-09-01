package SortColors;

public class Solution {
    public void sortColors(int[] nums) {
        var l = 0;
        var r = nums.length - 1;
        var i = 0;

        while (i <= r) {
            if (nums[i] == 0) {

                var tmp = nums[i];
                nums[i] = nums[l];
                nums[l] = tmp;
                ++l;
            } else if (nums[i] == 2) {
                var tmp = nums[i];
                nums[i] = nums[r];
                nums[r] = tmp;
                --r;
                continue;
            }
            ++i;
        }

    }

    public void sortColorsBS(int[] nums) {
        int[] freq = new int[3];

        for (var num:nums) {
            ++freq[num];
        }

        var j=0;
        for (var k=0;k< freq.length;++k) {
            var f=freq[k];
            for (int i = 0; i < f; i++) {
                nums[i+j] = k;
            }
            j+=f;
        }
    }
}
