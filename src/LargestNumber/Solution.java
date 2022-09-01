package LargestNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String largestNumber(int[] nums) {


        Comparator<String> comparator = (s1, s2) ->  -(s1+s2).compareTo(s2+s1);
        String result =
                Arrays.stream(nums)
                        .mapToObj(x->Integer.toString(x))
                        .sorted(comparator)
                        .collect(Collectors.joining());


        if (result.startsWith("0"))
            result = "0";

        return result;

    }
}
