package SimilarStringGroups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UnionFind {
    private int[] parent;
    private int[] rank;
    private int nrGroups ;

    public UnionFind(int n) {
        parent=new int[n];
        rank=new int[n];
        nrGroups=n;
        for (int i = 0; i < n; i++) {
            parent[i]=i;
            rank[i]=1;
        }
    }

    public void join(int i, int j) {
        int parentI = find(i);
        int parentJ = find(j);
        if (parentI==parentJ)
            return;
        if (rank[parentI]>=rank[parentJ]) {
            parent[parentJ]=parentI;
            rank[parentI]+=rank[parentJ];
        } else {
            parent[parentI]=parentJ;
            rank[parentJ]+=rank[parentI];
        }
        --nrGroups;
    }

    private int find(int i) {
        while (parent[i]!=i) {
            int tmp = i;
            i=parent[i];
            parent[tmp]=i;
        }
        return i;
    }

    public int getNrGroups() {
        return nrGroups;
    }

}
public class SolutionUF {
    public int numSimilarGroups(String[] strs) {
        final int n = strs.length;

        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSimilar(strs[i], strs[j])) {
                    uf.join(i,j);
                }
            }
        }

        return uf.getNrGroups();
    }

    private boolean isSimilar(String str1, String str2) {
        int nrDiff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ++nrDiff;
                if (nrDiff > 2)
                    return false;
            }
        }
        return nrDiff == 0 || nrDiff == 2;
    }
}
