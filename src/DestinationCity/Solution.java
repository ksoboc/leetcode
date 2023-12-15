package DestinationCity;

import java.util.*;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> depart = new HashSet<>();
        Set<String> dest = new HashSet<>();

        for (List<String> path : paths) {
            depart.add (path.get(0));
            dest.add (path.get(1));
        }

        for (String city : dest) {
            if (!depart.contains(city)) return city;
        }

        return "";
    }
}
