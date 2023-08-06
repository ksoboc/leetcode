package NumberofMusicPlaylists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        var res=solution.numMusicPlaylists(3,3,1);
        System.out.println("res = " + res);
        assertEquals(6,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        var res=solution.numMusicPlaylists(2,3,0);
        System.out.println("res = " + res);
        assertEquals(6,res);
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        var res=solution.numMusicPlaylists(2,3,1);
        System.out.println("res = " + res);
        assertEquals(2,res);
    }
    @Test
    void test4() {
        SolutionDP solution=new SolutionDP();
        var res=solution.numMusicPlaylists(16,16,4);
        System.out.println("res = " + res);
        assertEquals(789741546,res);
    }

}