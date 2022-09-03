package NumbersWithSameConsecutiveDifferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    //    private Set<Integer> numbers = new HashSet<>();
    private List<Integer> numbers = new ArrayList<>();

    public int[] numsSameConsecDiff(int n, int k) {


        for (int i = 1; i <= 9; i++) {
            dfs(i, n, 1, k, i);
        }

        int[] res = new int[numbers.size()];

        for (var i = 0; i < numbers.size(); ++i) {
            res[i] = numbers.get(i);
        }
        return res;
    }

    private void dfs(int startNum, int n, int pos, int k, int num) {

        if (pos >= n) {
            numbers.add(num);
            return;
        }

        int nextDigit=startNum-k;
        if (nextDigit>=0)
            dfs(nextDigit,n,pos+1,k,num*10+nextDigit);
        if (k>0) {
            nextDigit = startNum + k;
            if (nextDigit<=9)
                dfs(nextDigit,n,pos+1,k,num*10+nextDigit);
        }


    }
}
