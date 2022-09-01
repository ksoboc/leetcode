package ImplementStackusingQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        for (int i = 0; i < queue.size()-1; i++) {
            int x = queue.poll();
            queue.offer(x);
        }
        return queue.poll();
    }

    public int top() {
        Integer[] arr = new Integer[queue.size()];
        queue.toArray(arr);
        return arr[arr.length-1];
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
