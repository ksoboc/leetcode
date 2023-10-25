package KthSymbolinGrammar;

public class Solution {
    public int kthGrammar(int n, int k) {
        return helper(n - 1, k - 1);
    }

    private int helper(int n, int k) {
        if (n == 0 || k == 0)
            return 0;

        if (helper(n - 1, k / 2) == 0) {
            return k & 1;
        } else {
            return 1 - k & 1;
        }
    }
}
