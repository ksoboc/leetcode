package PathwithMaximumProbability;

import java.util.*;

public class Solution {
    private class Pair {
        int vert;
        double prob;

        public Pair(int vert, double prob) {
            this.vert = vert;
            this.prob = prob;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<Pair>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; ++i) {
            var edge = edges[i];
            adj[edge[0]].add(new Pair(edge[1], Math.log(succProb[i])));
            adj[edge[1]].add(new Pair(edge[0], Math.log(succProb[i])));
        }

        double[] maxProb = new double[n];
        Arrays.fill(maxProb, Double.NEGATIVE_INFINITY);
        maxProb[start] = 0;


        Comparator<Pair> comp = (a, b) -> Double.compare(b.prob, a.prob);
        PriorityQueue<Pair> pq = new PriorityQueue<>(comp);
        pq.offer(new Pair(start, 0.0));

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.vert;

            if (node == end)
                return Math.exp(pair.prob);
            double nodeProb = pair.prob;

            for (var pair2 : adj[node]) {
                double newProb = pair2.prob + nodeProb;
                if (newProb > maxProb[pair2.vert]) {
                    pq.offer(new Pair(pair2.vert, newProb));
                    maxProb[pair2.vert] = newProb;
                }
            }
        }

        return 0;
    }
}
