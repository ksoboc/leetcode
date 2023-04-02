package SuccessfulPairsofSpellsandPotions;

import java.util.Arrays;

public class SolutionBinSearch {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = potions.length;
        int maxPotion = potions[m -1];
        int[] res = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int spell=spells[i];
            int minPotion = (int) Math.ceil((double)success/spell);
            if (minPotion>maxPotion) {
                res[i]=0;
                continue;
            }
            int index = lowerBound(potions,minPotion);
            res[i] = m -index;
        }
        return res;
    }

    private int lowerBound(int[] potions, int minPotion) {
        int l=0;
        int r=potions.length-1;
        while (l<r) {
            int mid = l + (r-l)/2;
            if (potions[mid]<minPotion) {
                l=mid+1;
            } else {
                r=mid;
            }
        }
        return l;
    }
}
