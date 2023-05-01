package AverageSalaryExcludingtheMinimumandMaximumSalary;

public class Solution {
    public double average(int[] salary) {
        int min = 10_000_000;
        int max = 0;
        int sum = 0;
        int count = 0;
        for (var sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
            ++count;
        }
        return ((double) sum - min - max) / (count - 2);

    }
}
