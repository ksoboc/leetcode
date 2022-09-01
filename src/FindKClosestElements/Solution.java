package FindKClosestElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        var l = 0;
        var r = arr.length - k;
        while (l < r) {
            var m = (l + r) / 2;
            if (arr[m + k] - x < x - arr[m])
                l = m + 1;
            else
                r = m;
        }

        return Arrays.stream(Arrays.copyOfRange(arr, l, l + k)).boxed().collect(Collectors.toList());

    }
}
