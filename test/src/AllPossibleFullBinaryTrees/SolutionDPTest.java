package AllPossibleFullBinaryTrees;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        List<TreeNode> res = solution.allPossibleFBT(3);


        System.out.println("res = " + res);
        assertEquals(1,res.size());
    }

    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        List<TreeNode> res = solution.allPossibleFBT(7);


        System.out.println("res = " + res.size());
        assertEquals(5,res.size());
    }


}