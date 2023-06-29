package ShortestPathtoGetAllKeys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.shortestPathAllKeys(new String[]{"@.a..","###.#","b.A.B"});
        System.out.println("res = " + res);
        assertEquals(8, res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.shortestPathAllKeys(new String[]{"@..aA","..B#.","....b"});
        assertEquals(6, res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.shortestPathAllKeys(new String[]{"@Aa"});
        assertEquals(-1, res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.shortestPathAllKeys(new String[]{"@...a",".###A","b.BCc"});
        assertEquals(10,res);
    }
    //"b","A","a","@","B"
    @Test
    void test5() {
        Solution solution=new Solution();
        var res = solution.shortestPathAllKeys(new String[]{".#.b.","A.#aB","#d...","@.cC.","D...#"});
        System.out.println("res = " + res);
    }


}