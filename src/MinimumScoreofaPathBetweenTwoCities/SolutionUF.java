package MinimumScoreofaPathBetweenTwoCities;

public class SolutionUF {
    private static class UnionFind {
        private int[] parent;
        private int[] rank;
        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i]=i;
                rank[i]=1;
            }

        }
        public int find(int x) {
            while (parent[x]!=x) {
                int prev = x;
                x=parent[x];
                parent[prev]=x;
            }
            return x;
        }
        public void join(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px==py)
                return ;
            if (rank[px]>=rank[py]) {
                parent[py]=parent[px];
                rank[px]+=rank[py];
            } else if (rank[px]<rank[py]){
                parent[px]=parent[py];
                rank[py]+=rank[px];
            }
        }
    }
    public int minScore(int n, int[][] roads) {
        UnionFind uf = new UnionFind(n+1);
        int res = Integer.MAX_VALUE;

        for (var road:roads) {
            uf.join(road[0],road[1]);
        }
        for (var road:roads) {
            if (uf.find(1)==uf.find(road[0])) {
                res=Math.min(res,road[2]);
            }
        }
        return res;
    }
}
