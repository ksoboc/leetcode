package FindPlayersWithZeroorOneLosses;

import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> playWins = new HashMap<>();
        Map<Integer, Integer> playLoss = new HashMap<>();

        for (var match : matches) {
            playWins.put(match[0], playWins.getOrDefault(match[0], 0) + 1);
            playLoss.put(match[1], playLoss.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for (var winner : playWins.keySet()) {
            if (!playLoss.containsKey(winner))
                winners.add(winner);
        }
        for (var loser : playLoss.keySet()) {
            if (playLoss.get(loser) == 1)
                losers.add(loser);
        }
        Collections.sort(winners);
        Collections.sort(losers);
        return List.of(winners, losers);
    }
}
