package SortIntegersbyTheNumberof1Bits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SolutionAlt {
    public int[] sortByBits(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) << 14;
        }
        Arrays.sort(arr);
        final int mask = (1<<14) - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] &= mask;
        }
        return arr;

    }
}
