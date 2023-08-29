package MinimumPenaltyforaShop;

public class Solution {
    public int bestClosingTime(String customers) {
        final int n = customers.length();
        final int[] prefixSum = new int[n+1];
        final int[] suffixSum = new int[n+1];

        int sum=0;
        for (int i=0;i<n;i++) {
            char ch=customers.charAt(i);
            prefixSum[i]=sum;
            if (ch=='N')
                ++sum;
        }
        prefixSum[n]=sum;
        sum=0;
        for (int i = n; i >0 ; i--) {
            char ch=customers.charAt(i-1);
            suffixSum[i]=sum;
            if (ch=='Y')
                ++sum;
        }
        suffixSum[0]=sum;

        int min=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i <= n; i++) {
            sum = prefixSum[i] + suffixSum[i];
            if (sum<min) {
                min=sum;
                res=i;
            }
        }
        return res;
    }
}
