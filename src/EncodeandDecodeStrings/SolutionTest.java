package EncodeandDecodeStrings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res=solution.encode(List.of("jeden","dwa"));
        assertEquals("5#jeden3#dwa",res);
        var list=solution.decode(res);

        assertEquals(2,list.size());
        System.out.println("list = " + list);
    }

}