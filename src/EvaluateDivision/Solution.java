package EvaluateDivision;

import java.util.*;

public class Solution {
    private class Pair {
        String str;
        double coeff;

        public Pair(String str, double coeff) {
            this.str = str;
            this.coeff = coeff;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair>> adj = new HashMap<>();
        Set<String> nodesSet = new HashSet<>();
        for (int i = 0; i < equations.size(); i++) {
            var equation = equations.get(i);
            double coeff = values[i];

            adj.computeIfAbsent(equation.get(0), x -> new ArrayList<>()).add(new Pair(equation.get(1), coeff));
            adj.computeIfAbsent(equation.get(1), x -> new ArrayList<>()).add(new Pair(equation.get(0), 1.0 / coeff));
            nodesSet.add(equation.get(0));
            nodesSet.add(equation.get(1));
        }

        double[] answer = new double[queries.size()];
        int i = 0;
        outer:
        for (var query : queries) {
            if (!(nodesSet.contains(query.get(0)) && nodesSet.contains(query.get(1)))) {
                answer[i++] = -1.0;
                continue ;
            }
            Queue<Pair> queue = new LinkedList<>();

            Pair node = new Pair(query.get(0), 1.0);
            queue.offer(node);
            Set<String> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                node = queue.poll();
                if (visited.contains(node.str))
                    continue ;
                visited.add(node.str);

                if (node.str.equals(query.get(1))) {
                    answer[i++] = node.coeff;
                    continue outer;
                }
                for (var nei : adj.get(node.str)) {
                    queue.offer(new Pair(nei.str, nei.coeff * node.coeff));
                }
            }
            answer[i++] = -1.0;
        }

        return answer;
    }
}
