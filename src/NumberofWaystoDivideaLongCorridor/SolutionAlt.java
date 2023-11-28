package NumberofWaystoDivideaLongCorridor;

import java.util.ArrayList;
import java.util.List;

public class SolutionAlt {
    public int numberOfWays(String corridor) {
        int len = corridor.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (corridor.charAt(i) == 'S') {
                list.add(i);
            }
        }

        if (list.size() == 0) return 0;
        if (list.size() % 2 != 0) return 0;

        final int MOD = (int) 1e9 + 7;

        long curr = 1;
        for (int i = 2; i < list.size(); i += 2) {
            long diff = list.get(i) - list.get(i - 1);
            curr *= diff;
            curr %= MOD;
        }

        return (int) curr;
    }
}
