package PermutationinString;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length())
            return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        int matches = 0;
        for (var i=0;i<s1.length();++i) {
            countS1[s1.charAt(i)-'a'] += 1;
            countS2[s2.charAt(i)-'a'] += 1;
        }
        for (var i=0;i<26;++i) {
            if (countS1[i]==countS2[i])
                matches+=1;
        }

        var l=0;
        for (var r=s1.length();r<s2.length();++r) {
            if (matches==26)
                return true;
            var index = s2.charAt(r)-'a';
            countS2[index]+=1;
            if (countS2[index]==countS1[index])
                matches+=1;
            else if (countS2[index]==countS1[index]+1)
                matches-=1;

            index=s2.charAt(l)-'a';
            countS2[index]-=1;
            if (countS2[index]==countS1[index])
                matches+=1;
            else if (countS2[index]==countS1[index]-1)
                matches-=1;
            l+=1;
        }
        return matches==26;

    }
}
