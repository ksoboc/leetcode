package CanMakeArithmeticProgressionFromSequence;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        final int n = arr.length;
        if (n <= 2)
            return true;
        int minV = Integer.MAX_VALUE;
        int maxV = Integer.MIN_VALUE;
        for (var e : arr) {
            minV = Math.min(minV, e);
            maxV = Math.max(maxV, e);
        }

        int diff = (maxV - minV) / (n - 1);
        if ((maxV - minV) % (n - 1) != 0) {
            return false;
        }

        int i = 0;
        while (i < n) {
            if (arr[i] == i * diff + minV)
                ++i;
            else if ((arr[i] - minV) % diff != 0)
                return false;
            else {
                int pos = (arr[i] - minV) / diff;
                if (arr[i] == arr[pos])
                    return false;
                int tmp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = tmp;
            }
        }

        return true;
    }
}
