package SortItemsbyGroupsRespectingDependencies;

import java.util.*;

public class Solution {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        int groupId = m;
        for (int i = 0; i < n; i++) {
            if (group[i] == -1) {
                group[i] = groupId;
                groupId++;
            }
        }

        Map<Integer, List<Integer>> groupGraph = new HashMap<>();
        int[] groupIndegree = new int[groupId];
        for (int i = 0; i < groupId; ++i) {
            groupGraph.put(i, new ArrayList<>());
        }

        Map<Integer,List<Integer>> adj = new HashMap<>();
        int[] inCount = new int[n];
        for (int node = 0; node < n; node++) {
            for (var prev:beforeItems.get(node)) {
                adj.computeIfAbsent(prev, x -> new ArrayList<>()).add(node);
                ++inCount[node];
                if (group[node] != group[prev]) {
                    groupGraph.get(group[prev]).add(group[node]);
                    groupIndegree[group[node]]++;
                }
            }
        }

        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inCount[i]==0)
                queue.offer(i);
        }

        List<Integer> orderedItems = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            orderedItems.add(node);
            if (adj.get(node)==null)
                continue;
            for (var nei:adj.get(node)) {
                --inCount[nei];
                if (inCount[nei]==0)
                    queue.add(nei);
            }
        }

        if (orderedItems.size()!=n) {
            return new int[0];
        }

        queue.clear();
        for (int i = 0; i < groupId; i++) {
            if (groupIndegree[i]==0)
                queue.offer(i);
        }
        List<Integer> orderedGroups=new ArrayList<>();
        while (!queue.isEmpty()) {
            int groupNode = queue.poll();
            orderedGroups.add(groupNode);
            if (groupGraph.get(groupNode)==null)
                continue;
            for (var nei:groupGraph.get(groupNode)) {
                --groupIndegree[nei];
                if (groupIndegree[nei]==0)
                    queue.add(nei);
            }
        }
        if (orderedGroups.size()!=groupId) {
            return new int[0];
        }

        Map<Integer, List<Integer>> orderedGroupsMap = new HashMap<>();
        for (Integer item : orderedItems) {
            orderedGroupsMap.computeIfAbsent(group[item], k -> new ArrayList<>()).add(item);
        }


        int[] ans = new int[n];
        int idx=0;
        for (var grp:orderedGroups) {
            List<Integer> groupMembers = orderedGroupsMap.get(grp);
            if (groupMembers==null)
                continue;
            for (var node:groupMembers) {
                ans[idx++]=node;
            }
        }

        return ans;
    }
}
