package MedianofTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int total = nums1.length + nums2.length;
        if (nums1.length < nums2.length) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        final int half = total / 2;

        int l = 0;
        int r = nums1.length - 1;
        if (l>r)
            r=l;
        while (true) {
            int i = l + (r - l) / 2;
            int j = Math.max(half - i - 2,-1);

            int aLeft = i >= 0 ? nums1[i] : Integer.MIN_VALUE;
            int aRight = i + 1 < nums1.length ? nums1[i + 1] : Integer.MAX_VALUE;
            int bLeft = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
            int bRight =  nums2.length== 0 || j+1 >= nums2.length ? Integer.MAX_VALUE :
                     nums2[j + 1];


            if (aLeft <= bRight && bLeft <= aRight) {
                if (total % 2 == 1) {
                    if (nums2.length==0) {
                        return aLeft;
                    }

                    return Math.min(aRight,bRight);
                } else {
                    return ((double) Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
                }
            } else if (aLeft > bRight) {
                r = i - 1;
                if (l>r) l=r;
            } else {
                l = i + 1;
                if (l>r) r=l;
            }

        }

    }
}
