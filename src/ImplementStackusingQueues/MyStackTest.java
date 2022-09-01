package ImplementStackusingQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack myStack=new MyStack();

    @Test
    void test() {
        myStack.push(1);
        myStack.push(2);
        assertEquals(2,myStack.top());
        assertEquals(2,myStack.pop());
        assertFalse(myStack.empty());
    }

}