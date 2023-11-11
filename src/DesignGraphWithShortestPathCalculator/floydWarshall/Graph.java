package DesignGraphWithShortestPathCalculator.floydWarshall;

import java.util.*;

public class Graph {
    private final int[][] adjMatrix;
    private final int nrNodes;

    private final int hugeVal = 1_000_000_000;

    public Graph(int n, int[][] edges) {
        nrNodes = n;
        adjMatrix = new int[n][n];
        for (var r : adjMatrix)
            Arrays.fill(r, hugeVal);

        for (var edge:edges) {
            adjMatrix[edge[0]][edge[1]] = edge[2];
        }
        for (int i = 0; i < n; i++) {
            adjMatrix[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    adjMatrix[j][k] = Math.min(adjMatrix[j][k], adjMatrix[j][i] + adjMatrix[i][k]);
                }
            }
        }
    }

    public void addEdge(int[] edge) {
        for (int i = 0; i < nrNodes; i++) {
            for (int j = 0; j < nrNodes; j++) {
                adjMatrix[i][j] = Math.min(adjMatrix[i][j], adjMatrix[i][edge[0]] + adjMatrix[edge[1]][j] + edge[2]);
            }
        }
    }

    public int shortestPath(int node1, int node2) {
        return adjMatrix[node1][node2] == hugeVal ? -1 : adjMatrix[node1][node2];
    }
}
