package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private int size;

    private final DoubleLinkedList history = new DoubleLinkedList();
    Map<Integer,ListNode> cache = new HashMap<Integer, ListNode>();


    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            ListNode node = cache.get(key);
            if (history.head!=node) {
                history.remove(node);
                history.addToHead(node);
            }
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            history.remove(cache.get(key));
        } else {
            if (size>=capacity) {
                evictLastNode();
            } else {
                ++size;
            }
        }
        ListNode newNode = new ListNode(key,value);
        history.addToHead(newNode);
        cache.put(key,newNode);
    }

    private void evictLastNode() {
        ListNode last=history.tail;
        if (last!=null) {
            cache.remove(last.key);
            history.remove(last);
        }
    }
}

class DoubleLinkedList {
    ListNode head;
    ListNode tail;

    public void addToHead(ListNode node) {
        node.next = head;
        if (head!=null)
            head.prev=node;
        head = node;
        if (tail==null)
            tail=node;
    }

    public void remove(ListNode node) {
        ListNode prev = node.prev;
        ListNode next = node.next;

        if (prev!=null) {
            prev.next = next;
        }
        if (next!=null) {
            next.prev=prev;
        }
        if (node==head) {
            head=next;
        }
        if (node==tail) {
            tail=prev;
        }
        node.prev=null;
        node.next=null;
    }
}

class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode prev;
    ListNode() {}
    ListNode(int val) { this.val = val; }

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}