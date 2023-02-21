package CountOddNumbersinanIntervalRange;

public class OddNumberCounter {
    public static int countOddNumbers(int low, int high) {
        int count;
        if (low % 2 != 0) {
            count = (high - low) / 2 + 1;
        } else {
            count = (high - low + 1) / 2;
        }
        return count;
    }
}
