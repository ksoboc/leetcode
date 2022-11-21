package MostStonesRemovedwithSameRoworColumn;

import java.util.*;

public class Solution {
    private class Pair {
        int col;
        int row;

        public Pair(int col, int row) {
            this.col = col;
            this.row = row;
        }

        public Pair(int[] stone) {
            this.col = stone[0];
            this.row = stone[1];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return col == pair.col && row == pair.row;
        }

        @Override
        public int hashCode() {
            return Objects.hash(col, row);
        }
    }
    public int removeStones(int[][] stones) {

        if (stones.length < 2)
            return 0;

        Map<Integer, List<int[]>> colMap = new HashMap<>();
        Map<Integer, List<int[]>> rowMap = new HashMap<>();

        for (var stone : stones) {
            var rowList = rowMap.getOrDefault(stone[0], new ArrayList<>());
            rowList.add(stone);
            rowMap.put(stone[0], rowList);

            var colList = colMap.getOrDefault(stone[1], new ArrayList<>());
            colList.add(stone);
            colMap.put(stone[1], colList);
        }

        Set<Pair> visited = new HashSet<>();
        int numComp = 0;
        for (var stone : stones) {
            if (!visited.contains(new Pair(stone))) {
                ++numComp;
                dfs(stone, rowMap, colMap, visited);
            }
        }
        return stones.length - numComp;
    }

    private void dfs(int[] stone, Map<Integer, List<int[]>> rowMap, Map<Integer, List<int[]>> colMap, Set<Pair> visited) {
        visited.add(new Pair(stone));
        for (var st:rowMap.get(stone[0])) {
            if (!visited.contains(new Pair(st))) {
                dfs(st,rowMap,colMap,visited);
            }
        }
        for (var st:colMap.get(stone[1])) {
            if (!visited.contains(new Pair(st))) {
                dfs(st,rowMap,colMap,visited);
            }
        }
    }
}
