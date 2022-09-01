package MinimumNumberofFlipstoMaketheBinaryStringAlternating;

public class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s = s.repeat(2);

        String alt1 = "01".repeat(n);
        String alt2 = "10".repeat(n);

        int l=0;
        int diff1=0;
        int diff2=0;
        int res = n;
        for (int r = 0; r < 2*n; r++) {
            if (s.charAt(r)!=alt1.charAt(r))
                ++diff1;
            if (s.charAt(r)!=alt2.charAt(r))
                ++diff2;

            if (r-l+1>n) {
                if (s.charAt(l)!=alt1.charAt(l))
                    --diff1;
                if (s.charAt(l)!=alt2.charAt(l))
                    --diff2;
                ++l;
            }
            if (r-l+1==n) {
                res = Math.min(res, Math.min(diff1,diff2));
            }
        }
        return res;

    }
}
