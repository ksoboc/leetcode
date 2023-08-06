package NumberofMusicPlaylists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.numMusicPlaylists(3,3,1);
        System.out.println("res = " + res);
        assertEquals(6,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.numMusicPlaylists(2,3,0);
        System.out.println("res = " + res);
        assertEquals(6,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.numMusicPlaylists(2,3,1);
        System.out.println("res = " + res);
        assertEquals(2,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res=solution.numMusicPlaylists(16,16,4);
        System.out.println("res = " + res);
        assertEquals(789741546,res);
    }

}