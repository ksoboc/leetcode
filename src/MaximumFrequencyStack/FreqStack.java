package MaximumFrequencyStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class FreqStack {
    private int maxCnt = 0;
    private Map<Integer, Integer> counts = new HashMap<>();
    private Map<Integer, Stack<Integer>> stacks = new HashMap<>();

    public FreqStack() {

    }

    public void push(int val) {
        var cnt = 1 + Optional.ofNullable(counts.get(val)).orElse(0);
        if (cnt>maxCnt) {
            maxCnt=cnt;
            stacks.put(maxCnt, new Stack<>());
        }
        stacks.get(cnt).push(val);
        counts.put(val,cnt);
    }

    public int pop() {
        var res = stacks.get(maxCnt).pop();
        if (stacks.get(maxCnt).isEmpty()) {
            --maxCnt;
        }
        counts.put(res, counts.get(res) - 1);
        return res;
    }
}
