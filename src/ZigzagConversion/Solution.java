package ZigzagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        var n = (numRows - 1) * 2;


        var res = new StringBuffer();

        for (var r = 0; r < numRows; ++r) {
            var inc = n - 2 * r;
            for (var i = r; i < s.length(); i += n) {
                res.append(s.charAt(i));
                if (r > 0 && r < numRows - 1) {
                    var sl = i + inc;
                    if (sl < s.length())
                        res.append(s.charAt(sl));
                }
            }
        }
        return res.toString();

    }
}
