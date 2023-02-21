package KeysandRooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private int count;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(0,rooms,visited);
        return count== rooms.size();

    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        if (visited[room])
            return;
        visited[room]=true;
        ++count;
        for (var r:rooms.get(room))
            dfs(r,rooms,visited);

    }
}
