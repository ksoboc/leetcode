package MakeArrayStrictlyIncreasing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionRec {

    private class Pair {
        int i;
        int prev;

        public Pair(int i, int prev) {
            this.i = i;
            this.prev = prev;
        }
    }

    private Map<Pair,Integer> dp = new HashMap<>();

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        int i = 1, j = 0;
        while (i < arr2.length) {
            if (arr2[i - 1] != arr2[i]) {
                arr2[j] = arr2[i - 1];
                ++j;
            }
            ++i;
        }
        arr2[j] = arr2[i - 1];

        int[] arr3 = Arrays.copyOf(arr2, j + 1);

        int res= makeArrayIncreasing(arr1, arr3, 0, -1) ;
        if (res>=2_001)
            return -1;
        return res;

    }

    private int makeArrayIncreasing(int[] arr, int[] arr3, int i, int prev) {

        if (i >= arr.length)
            return 0;

        if (dp.containsKey(new Pair(i,prev)))
            return dp.get(new Pair(i,prev));



        int numChanges = 2_001;

        if (arr[i] > prev) {
            numChanges = makeArrayIncreasing(arr, arr3, i + 1, arr[i]);
        }

        int k = findFistGreater(arr3, 0, prev);
        if (k < arr3.length) {
                numChanges = Math.min(numChanges, 1 + makeArrayIncreasing(arr, arr3, i + 1, arr3[k]));
        }

        dp.put(new Pair(i,prev),numChanges);
        return numChanges;


    }

    private int findFistGreater(int[] arr, int i, int prev) {
        int l = i, r = arr.length ;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= prev) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
