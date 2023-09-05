package CopyListwithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldToNewMap = new HashMap<>();
        for (var node = head;  node!=null ; node=node.next) {
            Node newNode = new Node(node.val);
            oldToNewMap.put(node, newNode);
        }

        for (var node = head;  node!=null ; node=node.next) {
            Node newNode = oldToNewMap.get(node);
            Node next = oldToNewMap.get(node.next);
            Node random = oldToNewMap.get(node.random);
            newNode.next=next;
            newNode.random=random;
        }

        return oldToNewMap.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
