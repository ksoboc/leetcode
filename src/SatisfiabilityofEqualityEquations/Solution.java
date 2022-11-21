package SatisfiabilityofEqualityEquations;

public class Solution {
    public boolean equationsPossible(String[] equations) {
        UnionFind uf = new UnionFind(26);

        for (var equation:equations) {
            if (equation.charAt(1)=='!')
                continue;
            char ch1=equation.charAt(0);
            char ch2=equation.charAt(3);
            uf.unify(ch1-'a',ch2-'a');
        }

        for (var equation:equations) {
            if (equation.charAt(1)=='=')
                continue;
            char ch1=equation.charAt(0);
            char ch2=equation.charAt(3);
            if (uf.connected(ch1-'a',ch2-'a'))
                return false;
        }
        return true;

    }
}

class UnionFind {
    private int[] id;
    private int[] sz;
    private int numComponents;
    private int size;

    public UnionFind(int size) {
        if (size<=0)
            throw new IllegalArgumentException("Size must be positive");
        this.size=numComponents=size;
        id=new int[size];
        sz=new int[size];
        for (int i = 0; i < size; i++) {
            id[i]=i;
            sz[i]=1;
        }
    }

    public int find(int p) {
        int root=p;
        while (id[root]!=root) {
            root=id[root];
        }

        while (p!=root) {
            int next=id[p];
            id[p]=root;
            p=next;
        }

        return root;
    }

    public void unify(int p1, int p2) {
        int root1=find(p1);
        int root2=find(p2);

        if (root1==root2)
            return;

        if (sz[root1]>sz[root2]) {
            sz[root1]+=sz[root2];
            id[root2]=root1;
        } else {
            sz[root2]+=sz[root1];
            id[root1]=root2;
        }
        --numComponents;
    }

    public boolean connected(int p, int q) {
        return find(p)==find(q);
    }
}
