package CopyListwithRandomPointer;

public class SolutionAlternatingLinks {
    public Node copyRandomList(Node head) {
        if (head==null)
            return head;

        for (var node = head;  node!=null ; node=node.next.next) {
            Node newNode = new Node(node.val);
            newNode.next=node.next;
            node.next=newNode;
        }

        for (var node = head;  node!=null ; node=node.next.next) {
            Node newNode = node.next;
            if (node.random!=null)
                newNode.random = node.random.next;
        }
        Node newHead = head.next;
        for (var node=head;node!=null;node=node.next) {
            Node nextNode=node.next.next;
            if (nextNode!=null)
                node.next.next=nextNode.next;
            node.next=nextNode;
        }

        return newHead;
    }
}

