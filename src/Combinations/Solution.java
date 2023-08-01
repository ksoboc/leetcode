package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> combinations;

    public List<List<Integer>> combine(int n, int k) {
        combinations = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(k));
        return combinations;
    }

    private void backtrack(int n, int k, int i, List<Integer> currentCombination) {
        if (currentCombination.size() == k) {
            combinations.add(List.copyOf(currentCombination));
            return;
        }

        for (int j = i; j < n + 1; j++) {
            currentCombination.add(j);
            backtrack(n, k, j + 1, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }

    }
}
