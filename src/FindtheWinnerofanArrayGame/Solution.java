package FindtheWinnerofanArrayGame;

public class Solution {
    public int getWinner(int[] arr, int k) {
        final int n = arr.length;
        int nrWins = 0;
        int winner = arr[0];
        int pos = 1;

        while (pos < n && nrWins < k) {
            if (arr[pos] > winner) {
                winner = arr[pos];
                nrWins = 1;
            } else {
                nrWins++;
            }
            pos++;
        }
        return winner;

    }
}
