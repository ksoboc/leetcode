package NumberofIncreasingPathsinaGrid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] grid = {{1,1},{3,4}};
        var res = solution.countPaths(grid);
        System.out.println("res = " + res);
        assertEquals(8,res);
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] grid = {{1},{2}};
        var res = solution.countPaths(grid);
        System.out.println("res = " + res);
        assertEquals(3,res);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] grid = {{73884,15322,92124,16515,54702,88526,61879,14125,21161,42701,35686,75932,8696},{59537,80396,65708,32310,46753,39759,4746,71413,84723,13233,23640,62230,11825},{6414,96122,64501,32523,55259,2935,44772,48912,26516,56256,69201,21079,52979},{50951,1748,42645,73435,81511,21445,26066,27605,40388,43702,47233,15333,86291},{87914,90237,95947,97341,93670,79822,32591,44096,55112,89104,36097,82759,15504},{3604,74013,74414,68295,58798,7050,71657,33463,38040,46180,61730,82754,57179},{86867,1972,13704,11581,99042,24825,77747,38671,40628,38626,54719,7366,36309},{69272,98273,16474,15204,40263,99956,36072,68173,77076,18094,97439,61968,7435},{95263,39616,37983,61376,256,7169,45149,94957,66151,13256,37776,25331,29659},{90001,12571,31093,46714,52347,44882,76055,53662,69928,37486,44020,2211,67466}};
        var res = solution.countPaths(grid);
        System.out.println("res = " + res);
        assertEquals(925,res);
    }

}