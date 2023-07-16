package SmallestSufficientTeam;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.smallestSufficientTeam(new String[]{"java","nodejs","reactjs"}, List.of(List.of("java"),List.of("nodejs"),List.of("nodejs","reactjs")));
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0,2},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.smallestSufficientTeam(new String[]{"algorithms","math","java","reactjs","csharp","aws"}, List.of(List.of("algorithms","math","java"),List.of("algorithms","math","reactjs"),List.of("java","csharp","aws"),List.of("reactjs","csharp"),List.of("csharp","math"),List.of("aws","java")));
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,2},res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.smallestSufficientTeam(new String[]{"mmcmnwacnhhdd","vza","mrxyc"}, List.of(List.of("mmcmnwacnhhdd"), Collections.emptyList(),Collections.emptyList(),List.of("vza","mrxyc")));
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0,3},res);
    }

}