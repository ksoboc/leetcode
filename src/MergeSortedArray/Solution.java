package MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var last = n + m - 1;
        --m;
        --n;

        while (n >= 0 && m >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[last--] = nums1[m--];
            } else {
                nums1[last--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[last--] = nums2[n--];
        }
    }
}
