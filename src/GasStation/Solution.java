package GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        var sumGas = 0;
        var sumCost = 0;
        for (int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if (sumGas < sumCost)
            return -1;

        var total = 0;
        var pos = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                pos = i + 1;
            }

        }
        return pos;

    }
}
