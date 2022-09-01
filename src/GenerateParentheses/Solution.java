package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> res = new ArrayList<>();
    private int size;
    public List<String> generateParenthesis(int n) {
        size = n;
        generate(0,0,"");
        return  res;
    }

    private void generate(int opened, int closed, String str) {
        if (opened==size && closed==size) {
            res.add(str);
            return;
        }
        if (opened<size) {
            generate(opened+1,closed,str+"(");
        }
        if (closed<opened) {
            generate(opened,closed+1,str+")");
        }
    }
}
