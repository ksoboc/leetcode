package ReverseWordsinaStringIII;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (var word :
                words) {
            StringBuilder wsb = new StringBuilder(word).reverse();
            sb.append(wsb).append(" ");
        }
        return sb.substring(0,sb.length()-1);

    }

    public String reverseWordsArr(String s) {
        char[] chars = s.toCharArray();
        int i=0,j=0;
        while (j<chars.length) {

            if (chars[j]==' ') {
                reverse(chars,i,j-1);
                i=j+1;

            }
            ++j;
        }
        if (j>i)
            reverse(chars,i,j-1);


        return new String(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while (i<j) {
            char tmp = chars[i];
            chars[i]=chars[j];
            chars[j]=tmp;
            ++i;
            --j;
        }
    }
}
