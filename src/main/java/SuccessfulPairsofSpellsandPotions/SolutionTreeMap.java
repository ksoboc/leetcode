package SuccessfulPairsofSpellsandPotions;

import java.util.Arrays;
import java.util.TreeMap;

public class SolutionTreeMap {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        TreeMap<Integer,Integer> numPotions=new TreeMap<>();
        int sum=1;

        for (int i = potions.length-1; i >=0 ; --i,++sum) {
            numPotions.put(potions[i], sum);
        }
        int i=0;
        for (var spell:spells) {
            int minPotion = (int) Math.ceil((double) success/spell);
            Integer key=numPotions.ceilingKey(minPotion);
            if (key==null)
                res[i]=0;
            else
                res[i] = numPotions.get(key);
            ++i;
        }
        return res;
    }
}
