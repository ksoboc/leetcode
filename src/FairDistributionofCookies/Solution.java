package FairDistributionofCookies;

public class Solution {
    private int[] cookiesChild;

    public int distributeCookies(int[] cookies, int k) {
        cookiesChild = new int[k];

        return distribute(cookies, k, 0, k);
    }

    private int distribute(int[] cookies, int k, int cookie, int zero_count) {
        if (zero_count>cookies.length-cookie)
            return Integer.MAX_VALUE;
        if (cookie == cookies.length) {
            int max = 0;
            for (int c = 0; c < k; ++c) {
                max = Math.max(cookiesChild[c], max);
            }
            return max;
        }

        int min = Integer.MAX_VALUE;
        for (int child = 0; child < k; child++) {
            if (cookiesChild[child]==0) --zero_count;
            cookiesChild[child] += cookies[cookie];
            min = Math.min(min, distribute(cookies, k, cookie + 1, zero_count));
            cookiesChild[child] -= cookies[cookie];
            if (cookiesChild[child]==0) ++zero_count;
        }
        return min;
    }
}
