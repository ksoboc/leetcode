package Combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private List<List<Integer>> res;
    private int k;
    private int n;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        this.k=k;
        this.n=n;
        backtrack(1,new ArrayList<Integer>());

        return res;
    }

    private void backtrack(int start, ArrayList<Integer> comb) {
        if (comb.size()==k) {
            res.add(List.copyOf(comb));
        }

        for (var i=start;i<n+1;++i) {
            comb.add(i);
            backtrack(i+1,comb);
            comb.remove(comb.size()-1);
        }
    }

    public List<List<Integer>> combineIter(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(k);
        int itr=0;

        for (var i=0;i<k;++i)
            temp.add(0);

        while (itr>-1) {
            temp.set(itr, temp.get(itr)+1);
            if (temp.get(itr)>n) itr--;
            else if (itr>=k-1) res.add(List.copyOf(temp));
            else {
                itr++;
                temp.set(itr,temp.get(itr-1));
            }
        }
        return res;
    }
}
