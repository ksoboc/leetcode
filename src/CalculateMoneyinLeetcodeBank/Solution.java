package CalculateMoneyinLeetcodeBank;

public class Solution {
    public int totalMoney(int n) {
        int nrOfElemsMain = n / 7;
        int nrOfElemsSub = n % 7;

        int res = 0;
        int firstElemMain = 28;
        res = nrOfElemsMain * (firstElemMain + firstElemMain + (nrOfElemsMain - 1) * 7) / 2;
        int firstElemSub = 1 + nrOfElemsMain;
        res += nrOfElemsSub * (firstElemSub + firstElemSub + nrOfElemsSub - 1 ) / 2;

        return res;
    }
}
