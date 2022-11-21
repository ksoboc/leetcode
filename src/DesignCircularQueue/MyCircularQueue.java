package DesignCircularQueue;

public class MyCircularQueue {
    private int size;
    private int len;
    private int[] queue;
    int b,e;

    public MyCircularQueue(int k) {
        size =k;
        queue=new int[size];
        len =0;
        b=0;
        e=-1;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;

        e=(e+1)% size;
        queue[e]=value;

        ++len;
        return true;

    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        b=(b+1)% size;
        --len;
        return true;

    }

    public int Front() {
        return isEmpty() ? -1 : queue[b];

    }

    public int Rear() {
        return isEmpty() ? -1 : queue[e];

    }

    public boolean isEmpty() {
        return len ==0;
    }

    public boolean isFull() {
        return len == size;
    }
}
