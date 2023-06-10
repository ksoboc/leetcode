package MaximumValueataGivenIndexinaBoundedArray;

public class Solution2 {

    public int maxValue(int n, int index, int maxSum) {
        int l = 1, r = maxSum;

        while (l <= r) {
            int m = l + (r - l) / 2;
            long sum = calcSum(m, index, n);
            if (sum > maxSum) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return r;

    }

    private long calcSum(int val, int index, int n) {
        long sum = 0;
        if (index >= val - 1) {
            sum += (long) (val - 1) * val / 2 + index - (val - 1);
        } else {
            sum += (long) index * (val - 1 + val - index) / 2;
        }
        if (n - index >= val) {
            sum += (long) val * (val + 1) / 2 + n - val - index;
        } else {
            int i = n - index;
            sum += (long) i * (val + val - i + 1) / 2;
        }
        return sum;
    }


}
