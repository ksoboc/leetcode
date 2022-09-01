package ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        var numOfWays1 = 0;
        var numOfWays2 = 1;

        var numOfWays = 0;

        for (var i=1;i<=n;++i) {
            numOfWays = numOfWays1 + numOfWays2;
            numOfWays1 = numOfWays2;
            numOfWays2 = numOfWays;
        }

        return numOfWays;
    }
}
