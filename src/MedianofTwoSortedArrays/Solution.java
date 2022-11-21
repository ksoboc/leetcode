package MedianofTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int part = total / 2;
        if (nums1.length > nums2.length) {
            var tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        int l = 0, r = nums1.length - 1;
        if (l>r) l=r;
        while (true) {
            int m = (l + r) / 2;
            int m2 = Math.max(part - m-2,-1);

            int l1 = (m >= 0) ?
                    ((m < nums1.length) ? nums1[m] : Integer.MIN_VALUE) :
                    Integer.MIN_VALUE;
            int r1 = m + 1 < nums1.length  ? nums1[m + 1] : Integer.MAX_VALUE;

            int l2 = m2 >= 0 ? nums2[m2] : Integer.MIN_VALUE;
            int r2 = ((m2 + 1) < nums2.length) ?
                    (((m2 + 1) < 0) ? Integer.MAX_VALUE : nums2[m2 + 1]) :
                    Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 1)
                    return Math.min(r1, r2);
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2) {
                r = m - 1;
                if (l>r) l=r;
            } else {
                l = m + 1;
                if (r<l) r=l;
            }
        }

    }
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int total= nums1.length + nums2.length;
        if (nums1.length<nums2.length) {
            int[] tmp=nums1;
            nums1=nums2;
            nums2=tmp;
        }
        if (nums2.length==0) {
            return total % 2 == 1 ? nums1[nums1.length / 2] : (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2.0;
        }

        int partLen = total/2;
        int l=0,r=partLen-1;

        while (true) {
            int m=(l+r)/2;
            int l1=m>=0? nums1[m] : Integer.MIN_VALUE;
            int r1=m+1>=nums1.length? Integer.MAX_VALUE: nums1[m+1];

            int m2=Math.max(partLen-m-2,-1);
            int l2=m2<0?Integer.MIN_VALUE: nums2[m2];
            int r2=m2+1< nums2.length? nums2[m2+1] : Integer.MAX_VALUE;

            if (l1<=r2 && l2<=r1) {
                if (total%2==1)
                    return Math.min(r1,r2);
                return (Math.min(r1,r2) + Math.max(l1,l2))/2.0;
            } else if (l1>r2) {
                r=m-1;
                if (l>r) l=r;
            } else {
                l = m + 1;
                if (r<l) r=l;
            }

        }
    }
}
