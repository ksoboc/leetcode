package PartitionLabels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test1() {
        var list = Arrays.asList(10);
        assertEquals(list, solution.partitionLabels("eccbbbbdec"));
    }

    @Test
    void test2() {
        var list = Arrays.asList(9,7,8);
        assertEquals(list, solution.partitionLabels("ababcbacadefegdehijhklij"));
    }

}