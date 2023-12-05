package CountofMatchesinTournament;

public class Solution {
    public int numberOfMatches(int n) {
        int teams = n;
        int matches = 0;
        while (teams > 1) {
            if ((teams & 1) == 0) {
                teams >>= 1;
                matches += teams;
            } else {
                --teams;
                matches += teams>>1;
                teams = (teams>>1) + 1;
            }
        }
        return matches;
    }
}
