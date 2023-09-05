package CopyListwithRandomPointer;

import org.junit.jupiter.api.Test;

class SolutionAlternatingLinksTest {
    @Test
    void test1() {
        SolutionAlternatingLinks solution=new SolutionAlternatingLinks();
        Node head=new Node(7);
        head.next=new Node(13);
        head.next.next=new Node(11);
        head.next.next.next=new Node(10);
        head.next.next.next.next=new Node(1);

        head.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next;

        var res = solution.copyRandomList(head);
        System.out.println("head.val = " + res.val);
    }

}