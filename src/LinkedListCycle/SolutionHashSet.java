package LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class SolutionHashSet {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode current=head;
        while (current!=null) {
            if (set.contains(current))
                return true;
            set.add(current);
            current=current.next;
        }
        return false;
    }
}

