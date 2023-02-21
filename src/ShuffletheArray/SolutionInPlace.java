package ShuffletheArray;

public class SolutionInPlace {
    public int[] shuffle(int[] nums, int n) {
        for (int i = n; i < n<<1; i++) {
            nums[i-n] |= nums[i] << 10;
        }
        int allOnes = (1 << 10) - 1;
        for (int i = n-1; i >= 0; --i) {
            int secondNum = nums[i] >> 10;
            int firstNum = nums[i] & allOnes;
            nums[i << 1] = firstNum;
            nums[(i<<1) + 1] = secondNum;
        }
        return nums;
    }
}
