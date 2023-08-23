package ReorganizeString;

public class SolutionAlt {

    public String reorganizeString(String s) {
        final int[] freq = new int[26];
        for (var ch:s.toCharArray()) {
            ++freq[ch-'a'];
        }
        int maxIdx = 0;
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>maxFreq) {
                maxIdx=i;
                maxFreq=freq[i];
            }
        }
        int n = s.length();
        if (maxFreq > (n +1)/2) return "";
        int i=0;
        char[] ans = new char[n];
        while (freq[maxIdx]>0) {
            ans[i]=(char)(maxIdx+'a');
            i+=2;
            --freq[maxIdx];
        }
        for (int j = 0; j < freq.length; j++) {
            while (freq[j]>0) {
                if (i>=n) {
                    i=1;
                }
                ans[i]=(char)(j+'a');
                i+=2;
                --freq[j];
            }
        }
        return String.valueOf(ans);
    }
}
