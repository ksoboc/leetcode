package MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        Map<Character, Integer> freqT = new HashMap<>();

        for (char ch : t.toCharArray()) {
            freqT.put(ch, 1 + freqT.getOrDefault(ch, 0));
        }

        int l = 0, r = 0;
        Map<Character, Integer> freqS = new HashMap<>();
        boolean gotAll = false;

        String res = "";
        int minL = s.length()+1;

        while (r<s.length()) {

            char ch;

            while (r < s.length() && !gotAll) {


                ch = s.charAt(r);
                freqS.put(ch, 1 + freqS.getOrDefault(ch, 0));

                gotAll = true;
                for (char key : freqT.keySet()) {
                    if (freqS.getOrDefault(key, 0) < freqT.getOrDefault(key, 0)) {
                        gotAll = false;
                        break;
                    }
                }
                ++r;


            }

            if (!gotAll)
                break;

            ch = s.charAt(l);
            while (l < r && freqS.getOrDefault(ch, 0) > freqT.getOrDefault(ch, 0)) {
                ++l;
                if (freqS.containsKey(ch)) {
                    freqS.put(ch, freqS.get(ch) - 1);
                }
                ch = s.charAt(l);
            }
            int len = r-l;
            if (len<minL) {
                minL=len;
                res = s.substring(l,r);


            }
            ch=s.charAt(l);
            freqS.put(ch, freqS.getOrDefault(ch,0)-1);
            ++l;
            gotAll=false;
        }
        return res;
    }
}
