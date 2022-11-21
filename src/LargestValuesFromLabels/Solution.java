package LargestValuesFromLabels;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.IntToDoubleFunction;

public class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        class Item {
            int value;
            int label;

            public Item(int value, int label) {
                this.value = value;
                this.label = label;
            }
        };
        PriorityQueue<Item> maxHeap = new PriorityQueue<>((i1,i2)->Integer.compare(i2.value,i1.value));
        for (int i = 0; i < values.length; ++i) {
            maxHeap.add(new Item(values[i],labels[i]));
        }
        Map<Integer,Integer> countLabel = new HashMap<>();
        int res=0;
        while (!maxHeap.isEmpty() && numWanted>0) {
            var item = maxHeap.poll();
            var numLabelUsed = countLabel.getOrDefault(item.label, 0);
            if (numLabelUsed < useLimit) {
                countLabel.put(item.label, numLabelUsed+1);
                --numWanted;
                res+=item.value;
            }
        }
        return res;
    }
}
