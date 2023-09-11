package GroupthePeopleGiventheGroupSizeTheyBelongTo;

import java.util.*;

public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> sizeToPeople = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            sizeToPeople.computeIfAbsent(groupSizes[i], x->new ArrayList<>()).add(i);
        }
        List<List<Integer>> result=new ArrayList<>();
        for (int size:sizeToPeople.keySet()) {
            var peopleList = sizeToPeople.get(size);

            for (int i = 0; i < peopleList.size(); i+=size) {
                result.add(new ArrayList<>(peopleList.subList(i,i+size)));
            }
        }
        return result;
    }
}
