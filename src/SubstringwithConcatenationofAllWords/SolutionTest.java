package SubstringwithConcatenationofAllWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
        assertArrayEquals(new Integer[]{0,9}, res.stream().toArray());
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"});
        assertArrayEquals(new Integer[]{}, res.stream().toArray());
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"});
        assertArrayEquals(new Integer[]{6,9,12}, res.stream().toArray());
    }

    //"wordgoodgoodgoodbestword"
    //["word","good","best","good"]
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"});
        assertArrayEquals(new Integer[]{8}, res.stream().toArray());
    }

}