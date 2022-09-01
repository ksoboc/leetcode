package DetectSquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectSquaresTest {

    @Test
    void test() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[]{3,10});
        detectSquares.add(new int[]{11,2});
        detectSquares.add(new int[]{3,2});
        var res = detectSquares.count(new int[]{11,10});
        System.out.println("res = " + res);
        res = detectSquares.count(new int[]{14,8});
        System.out.println("res = " + res);
        detectSquares.add(new int[]{11,2});
        res =detectSquares.count(new int[]{11,10});
        System.out.println("res = " + res);
    }

}