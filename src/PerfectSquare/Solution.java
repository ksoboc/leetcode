package PerfectSquare;

public class Solution {
    int numSquares(int n) {
        int i = (int) Math.sqrt(n);
        if (i*i==n) return 1;

        if (checkTwo(n)) return 2;
        while (n % 4 == 0) n /= 4;
        if (n % 8 != 7) return 3;

        return 4;
    }

    boolean checkTwo(int c) {
        while (c % 2 == 0) c /=  2;
        while (c % 5 == 0) c /=  5;
        while (c % 9 == 0) c /=  9;

        if (c % 3 == 0) return false;

        if (c == 0 || c == 1 || c == 13 || c == 17)
            return true;


        int i = 0, j = (int) Math.sqrt(c);

        while (i <= j) {
            if (i * i + j * j == c) return true;
            if (i * i + j * j < c) i += 1;
            if (i * i + j * j > c) j -= 1;
        }

        return false;
    }


}
