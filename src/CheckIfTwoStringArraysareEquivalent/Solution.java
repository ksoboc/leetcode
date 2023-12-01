package CheckIfTwoStringArraysareEquivalent;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for (var w1:word1)
            sb1.append(w1);

        for (var w2:word2)
            sb2.append(w2);

        return sb1.compareTo(sb2)==0;
    }
}
