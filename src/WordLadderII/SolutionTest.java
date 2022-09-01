package WordLadderII;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.findLadders("hit","cog", List.of("hot","dot","dog","lot","log","cog"));
        // assertEquals(2,res.size());
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.findLadders2("hit","cog", List.of("hot","dot","dog","lot","log","cog"));
        // assertEquals(2,res.size());
        System.out.println("res = " + res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res = solution.findLadders2("a","c", List.of("a","b","c"));
        // assertEquals(2,res.size());
        System.out.println("res = " + res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        var res = solution.findLadders2("teach","place", List.of("peale","wilts","place","fetch","purer","pooch","peace","poach","berra","teach","rheum","peach"));
        // assertEquals(2,res.size());
        System.out.println("res = " + res);
    }

}