package FruitIntoBaskets;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0)
            return 0;

        Map<Integer, Integer> fruitNrToLastPos = new HashMap<>();
        int i = 0, j = 0;
        int maxFruits = 1;
        while (j < fruits.length) {

            fruitNrToLastPos.put(fruits[j], j++);

            if (fruitNrToLastPos.size() > 2) {
                int min = fruits.length;
                for (var pos : fruitNrToLastPos.values()) {
                    min = Math.min(min, pos);
                }
                i = min + 1;
                fruitNrToLastPos.remove(fruits[min]);
            }
            maxFruits = Math.max(maxFruits, j - i);
        }
        return maxFruits;

    }

    public int totalFruit2(int[] tree) {
        Map<Integer, Integer> count = new HashMap<>();
        int i = 0, j;
        for (j = 0; j < tree.length; ++j) {
            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
            if (count.size() > 2) {
                count.put(tree[i], count.get(tree[i]) - 1);
                count.remove(tree[i++], 0);
            }
        }
        return j - i;
    }
}
