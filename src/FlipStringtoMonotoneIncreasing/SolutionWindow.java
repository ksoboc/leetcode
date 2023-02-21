package FlipStringtoMonotoneIncreasing;

public class SolutionWindow {
    public int minFlipsMonoIncr(String s) {
        int m = 0;
        for (var ch:s.toCharArray())
            if (ch=='0')
                ++m;

        int ans=m;
        for (var ch:s.toCharArray()) {
            if (ch=='0') {
                m--;
                ans=Math.min(ans,m);
            }
            else
                m++;
        }
        return ans;
    }
}
