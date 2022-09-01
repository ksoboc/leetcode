package PrefixandSuffixSearch;

import java.util.HashMap;
import java.util.Map;

public class WordFilter2 {
    Map<String,Integer> map = new HashMap<>();

    public WordFilter2(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 1; j < word.length()+1; j++) {
                StringBuilder prefix = new StringBuilder();
                prefix.append(word.substring(0,j));
                prefix.append(".");
                for (int k = word.length()-1; k >=0 ; k--) {
                    StringBuilder key = new StringBuilder(prefix);
                    key.append(word.substring(k));
                    map.put(key.toString(), i);
                }

            }

        }
    }

    public int f(String prefix, String suffix) {
        String key = prefix + "." + suffix;
        return map.containsKey(key) ? map.get(key) : -1;
    }
}
