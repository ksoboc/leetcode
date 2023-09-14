package ReconstructItinerary;

import java.util.*;

public class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> adj = new HashMap<>();
        for (var ticket : tickets) {
            adj.put(ticket.get(0), new ArrayList<>());
            adj.put(ticket.get(1), new ArrayList<>());
        }
        for (var ticket : tickets) {
            adj.get(ticket.get(0)).add(ticket.get(1));
        }
        for (var ticket : tickets) {
            Collections.sort(adj.get(ticket.get(0)));
        }
        List<String> itinerary = new ArrayList<>();
        itinerary.add("JFK");

        find(adj, "JFK", itinerary, tickets.size());
        return itinerary;
    }

    private boolean find(Map<String, List<String>> adj, String start, List<String> itinerary, int numOfTickets) {
        if (itinerary.size() == numOfTickets + 1)
            return true;

        List<String> newAdj = List.copyOf(adj.get(start));
        for (int i = 0; i < newAdj.size(); ++i) {
            String dest = newAdj.get(i);
            itinerary.add(dest);
            adj.get(start).remove(i);
            if (find(adj, dest, itinerary, numOfTickets))
                return true;
            itinerary.remove(itinerary.size() - 1);
            adj.get(start).add(i, dest);
        }
        return false;
    }

}
