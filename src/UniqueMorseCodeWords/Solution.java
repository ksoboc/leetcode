package UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for (var word:words) {
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morseCodes[word.charAt(i)-'a']);
            }
            set.add(sb.toString());

        }
        return set.size();
    }
}
