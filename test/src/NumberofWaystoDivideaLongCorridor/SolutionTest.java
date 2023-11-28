package NumberofWaystoDivideaLongCorridor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        String corridor = "SSPPSPS";
        Solution solution=new Solution();
        var res = solution.numberOfWays(corridor);
        System.out.println("res = " + res);
        assertEquals(3,res);
    }

    @Test
    void test2() {
        String corridor = "PPSPSP";
        Solution solution=new Solution();
        var res = solution.numberOfWays(corridor);
        System.out.println("res = " + res);
        assertEquals(1,res);
    }
    @Test
    void test3() {
        String corridor = "S";
        Solution solution=new Solution();
        var res = solution.numberOfWays(corridor);
        System.out.println("res = " + res);
        assertEquals(0,res);
    }

    @Test
    void test4() {
        String corridor = "PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS";
        Solution solution=new Solution();
        var res = solution.numberOfWays(corridor);
        System.out.println("res = " + res);
        assertEquals(18335643,res);
    }


}