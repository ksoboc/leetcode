package ReconstructItinerary;

import java.util.*;

public class Solution {
    private List<String> res = new ArrayList<>();
    private Map<String,List<String>> adjList;
    private List<List<String>> tickets;

    public List<String> findItinerary(List<List<String>> tickets) {
        this.tickets=tickets;
        Collections.sort(tickets,
                Comparator.comparing(a -> ((List<String>)a).get(0))
                        .thenComparing(a->((List<String>)a).get(1)));

        adjList = new HashMap<>();
        for (int i = 0; i < tickets.size(); i++) {
            final List<String> ticket = tickets.get(i);
            adjList.merge(ticket.get(0),
                    new ArrayList<>(List.of(ticket.get(1))),
                    (l,n)->{l.add(ticket.get(1));return l;});
        }
        res.add("JFK");
        dfs("JFK");

        return res;
    }

    private boolean dfs(String src) {
        if (res.size()== tickets.size()+1)
            return true;
        if (!adjList.containsKey(src))
            return false;
        var temp = List.copyOf(adjList.get(src));
        for (int i=0; i<temp.size(); ++i) {
            String dest=temp.get(i);
            adjList.get(src).remove(i);
            res.add(dest);
            if (dfs(dest))
                return true;
            adjList.get(src).add(i,dest);
            res.remove(res.size()-1);
        }
        return false;
    }
}
