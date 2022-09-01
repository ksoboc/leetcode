package MaximumFrequencyStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreqStackTest {
    @Test
    void test() {
        FreqStack freqStack = new FreqStack();
        freqStack.push(5); // The stack is [5]
        freqStack.push(7); // The stack is [5,7]
        freqStack.push(5); // The stack is [5,7,5]
        freqStack.push(7); // The stack is [5,7,5,7]
        freqStack.push(4); // The stack is [5,7,5,7,4]
        freqStack.push(5); // The stack is [5,7,5,7,4,5]
        // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        assertEquals(5,freqStack.pop());
        // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
        assertEquals(7, freqStack.pop());
        // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
        assertEquals(5, freqStack.pop());
        // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack becomes [5,7].
        assertEquals(4, freqStack.pop());
    }

}