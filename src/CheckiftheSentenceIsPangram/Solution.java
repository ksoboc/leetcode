package CheckiftheSentenceIsPangram;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        int flag = 0;
        int pangram = (1 << 26) - 1;
        for (char ch : sentence.toCharArray()) {
            int pos = ch - 'a';
            flag |= 1 << pos;
            if (flag == pangram)
                return true;
        }
        return false;
    }
}
