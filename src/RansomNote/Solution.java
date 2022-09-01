package RansomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] freq = new char[26];
        for (char ch:magazine.toCharArray()) {
            ++freq[ch-'a'];
        }

        for (char ch:ransomNote.toCharArray()) {

            int idx=ch-'a';
            int count = freq[idx];
            if (count==0)
                return false;
            --freq[idx];
        }
        return true;
    }
}
