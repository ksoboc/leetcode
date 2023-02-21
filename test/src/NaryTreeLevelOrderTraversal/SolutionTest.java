package NaryTreeLevelOrderTraversal;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
       List<Integer> list = new ArrayList<>(List.of(1,2,3,4,7,7,7,10,10,11));
       Map<Integer,Integer> map = new HashMap<>();

       for (var elem:list) {
           map.put(elem, map.getOrDefault(elem,0)+1);
       }

       List<Map.Entry<Integer,Integer>> list1 = map.entrySet().stream()
               .sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
               .collect(Collectors.toList());

        System.out.println("list1.get(1) = " + list1.get(1));


    }

    @Test
    void test2() {
        List<Integer> list =
                null;
        Map<Integer,Integer> map = new HashMap<>();

        for (var elem:list) {
            map.put(elem, map.getOrDefault(elem,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list1 = map.entrySet().stream()
                .sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toList());

//        Optional.ofNullable(list1.size()<2 ? null: list1.get(1))
//                .map(entry -> "Value = " + entry)
//                .or(v -> s(v));

    }
  static String s(Object v){return "string";}
}