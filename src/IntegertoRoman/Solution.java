package IntegertoRoman;

public class Solution {
    class Pair {
        String sym;
        int val;

        public Pair(String sym, int val) {
            this.sym = sym;
            this.val = val;
        }
    }

    Pair[] pairs = {new Pair("I", 1),
            new Pair("IV", 4),
            new Pair("V", 5),
            new Pair("IX", 9),
            new Pair("X", 10),
            new Pair("XL", 40),
            new Pair("L", 50),
            new Pair("XC", 90),
            new Pair("C", 100),
            new Pair("CD", 400),
            new Pair("D", 500),
            new Pair("CM", 900),
            new Pair("M", 1000)};

    public String intToRoman(int num) {
        var res = "";
        for (var i = pairs.length - 1; i >= 0; --i) {
            Pair pair = pairs[i];
            if (num / pair.val > 0) {
                int count = num / pair.val;
                res += pair.sym.repeat(count);
            }
            num %= pair.val;
        }

        return res;
    }
}
