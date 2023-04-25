package SmallestNumberinInfiniteSet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {
    @Test
    void test1() {
        SmallestInfiniteSet smallestInfiniteSet=new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);
        int res = smallestInfiniteSet.popSmallest();
        assertEquals(1,res);
        res = smallestInfiniteSet.popSmallest();
        assertEquals(2,res);
        res = smallestInfiniteSet.popSmallest();
        assertEquals(3,res);
        smallestInfiniteSet.addBack(1);
        res = smallestInfiniteSet.popSmallest();
        assertEquals(1,res);

    }

}