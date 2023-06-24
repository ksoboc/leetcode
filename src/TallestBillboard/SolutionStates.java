package TallestBillboard;

import java.util.*;

public class SolutionStates {

    public int tallestBillboard(int[] rods) {
        int n = rods.length;
        Map<Integer, Integer> leftHalf = helper(rods, 0, n / 2);
        Map<Integer, Integer> rightHalf = helper(rods, n / 2, n);

        int res = 0;
        for (var diff : leftHalf.keySet()) {
            if (rightHalf.containsKey(-diff)) {
                res = Math.max(res, leftHalf.get(diff) + rightHalf.get(-diff));
            }
        }
        return res;
    }

    private class Pair<T1, T2> {
        T1 e1;
        T2 e2;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(e1, pair.e1) && Objects.equals(e2, pair.e2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(e1, e2);
        }

        public Pair(T1 e1, T2 e2) {
            this.e1 = e1;
            this.e2 = e2;
        }
    }

    private Map<Integer, Integer> helper(int[] rods, int leftIndex, int rightIndex) {
        Set<Pair<Integer, Integer>> states = new HashSet<>();
        states.add(new Pair<>(0, 0));
        for (int i = leftIndex; i < rightIndex; ++i) {
            int r = rods[i];
            Set<Pair<Integer, Integer>> newStates = new HashSet<>();
            for (var state : states) {
                newStates.add(new Pair<>(state.e1 + r, state.e2));
                newStates.add(new Pair<>(state.e1, state.e2 + r));
            }
            states.addAll(newStates);
        }
        Map<Integer, Integer> dp = new HashMap<>();
        for (var state : states) {
            int left = state.e1, right = state.e2;
            dp.put(left - right, Math.max(left, dp.getOrDefault(left - right, 0)));
        }
        return dp;
    }

}
