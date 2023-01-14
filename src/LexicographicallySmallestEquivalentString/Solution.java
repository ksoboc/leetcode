package LexicographicallySmallestEquivalentString;

public class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UF uf = new UF(26);

        for (int i = 0; i < s1.length(); i++) {
            uf.union(s1.charAt(i), s2.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            sb.append((char) (uf.find(baseStr.charAt(i)) + 'a'));
        }

        return sb.toString();
    }
}

class UF {

    char[] parent;

    public UF(int n) {
        parent = new char[n];
        for (char i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(char ch1, char ch2) {
        char r1 = find(ch1);
        char r2 = find(ch2);

        if (r1 == r2)
            return;

        if (r1 < r2) {
            parent[r2] = r1;
        } else {
            parent[r1] = r2;
        }


    }

    public char find(char ch) {
        char idx = (char) (ch - 'a');

        char r = parent[idx];
        while (r != idx) {
            idx = r;

            r = parent[r];
            parent[idx] = r;
        }
        return r;
    }
}
