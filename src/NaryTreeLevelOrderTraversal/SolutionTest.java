package NaryTreeLevelOrderTraversal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Node root = arrToTree(new Integer[]{1,null,3,2,4,null,5,6});
        Solution solution=new Solution();
        var res = solution.levelOrder(root);
        System.out.println("res = " + res);
    }

    @Test
    void test2() {
        Node root = arrToTree(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
        Solution solution=new Solution();
        var res = solution.levelOrder(root);
        System.out.println("res = " + res);
    }

    private Node arrToTree(Integer[] array) {
        Node dummy = new Node();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(dummy);
        int pos=0;
        while (!queue.isEmpty()) {
            List<Node> children = new ArrayList<>();
            while (pos<array.length && array[pos]!=null) {
                Node child = new Node(array[pos]);
                children.add(child);
                queue.offer(child);
                ++pos;
            }
            Node parent= queue.poll();
            parent.children=children;
            ++pos;
        }
        return dummy.children.get(0);
    }

}