package JumpGameIV;

import java.util.*;

public class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }
        Queue<Integer> curs = new LinkedList<>(); // store current layer
        curs.add(0);
        Set<Integer> visited = new HashSet<>();
        int step = 0;
        while (!curs.isEmpty()) {
            int size = curs.size();
            while (size-- > 0) {
                int node = curs.poll();
                if (node == n - 1)
                    return step;

                for (int child : graph.get(arr[node])) {
                    if (!visited.contains(child)) {
                        visited.add(child);
                        curs.offer(child);
                    }
                }

                graph.get(arr[node]).clear();

                if (node + 1 < n && !visited.contains(node + 1)) {
                    visited.add(node + 1);
                    curs.offer(node + 1);
                }
                if (node - 1 > 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1);
                    curs.offer(node - 1);
                }
            }

            ++step;
        }
        return -1;
    }
    public int minJumpsAlternating(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }
        Set<Integer> curs = new HashSet<>(); // store current layer
        curs.add(0);
        Set<Integer> other = new HashSet<>();
        other.add(n-1);
        Set<Integer> visited = new HashSet<>();
        int step = 0;
        while (!curs.isEmpty()) {

            if (curs.size()>other.size()) {
                Set<Integer> tmp=curs;
                curs=other;
                other=tmp;
            }


            Set<Integer> next = new HashSet<>();
            for (int node:curs){

                for (int child : graph.get(arr[node])) {
                    if (other.contains(child))
                        return step+1;
                    if (!visited.contains(child)) {
                        visited.add(child);
                        next.add(child);
                    }
                }

                graph.get(arr[node]).clear();

                if (other.contains(node+1)||other.contains(node-1))
                    return step+1;

                if (node + 1 < n && !visited.contains(node + 1)) {
                    visited.add(node + 1);
                    next.add(node + 1);
                }
                if (node - 1 > 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1);
                    next.add(node - 1);
                }
            }
            curs = next;
            ++step;
        }
        return -1;
    }

}
