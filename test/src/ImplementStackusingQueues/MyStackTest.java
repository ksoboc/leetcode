package ImplementStackusingQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test
    void test1() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int elem=myStack.top(); // return 2
        assertEquals(2,elem);
        elem=myStack.pop(); // return 2
        assertEquals(2,elem);
        var res=myStack.empty();
        assertFalse(res);
    }

}