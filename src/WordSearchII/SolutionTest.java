package WordSearchII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};

        var res = solution.findWords(board,words);

        System.out.println("res = " + res);
        assertEquals(2,res.size());

    }

    @Test
    void test2() {
        char[][] board = {{'a','b'},{'c','d'}};
        String[]words = {"oath","pea","eat","rain"};

        var res = solution.findWords(board,words);

        System.out.println("res = " + res);
        assertTrue(res.isEmpty());
    }

}