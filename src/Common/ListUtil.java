package Common;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    public static ListNode arrayToList(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for (int i = 1; i < arr.length; i++) {
            node.next = new ListNode(arr[i]);
            node = node.next;
        }
        return head;
    }

    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null)
                sb.append(", ");
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static int[] listToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
