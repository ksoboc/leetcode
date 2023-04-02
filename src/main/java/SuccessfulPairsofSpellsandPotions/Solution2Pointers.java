package SuccessfulPairsofSpellsandPotions;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2Pointers {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int spellsLength = spells.length;
        int[][] spellsSorted = new int[spellsLength][2];
        for (int i = 0; i < spellsLength; i++) {
            spellsSorted[i][0] = spells[i];
            spellsSorted[i][1] = i;
        }
        Arrays.sort(spellsSorted, Comparator.comparingInt(a -> a[0]));
        int potionsLength = potions.length;
        int potionsPointer = potionsLength - 1;
        int[] res = new int[spellsLength];
        for (var spellPair : spellsSorted) {
            int spell = spellPair[0];

            while (potionsPointer >= 0 && (long) spell * potions[potionsPointer] >= success) {
                --potionsPointer;
            }
            int index = spellPair[1];
            res[index] = potionsLength - potionsPointer - 1;
        }
        return res;
    }
}
