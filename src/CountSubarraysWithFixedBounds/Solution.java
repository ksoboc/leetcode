package CountSubarraysWithFixedBounds;

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int leftBound = -1;
        int minPosition = -1;
        int maxPosition = -1;
        long answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                leftBound = minPosition = maxPosition = i;
            else {
                if (nums[i] == minK) {
                    minPosition = i;
                }
                if (nums[i] == maxK) {
                    maxPosition = i;
                }
            }
            answer += Math.min(minPosition, maxPosition) - leftBound;
        }
        return answer;
    }

    public static int countSubarrays2(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == minK) {
                // Check for the subarrays that end at index i
                for (int j = i; j < n; j++) {
                    if (nums[j] == maxK) {
                        count++;
                    } else if (nums[j] < minK) {
                        // Subarray ends here as the minK condition is no longer satisfied
                        break;
                    }
                }
            } else if (nums[i] == maxK) {
                // Check for the subarrays that end at index i
                for (int j = i; j < n; j++) {
                    if (nums[j] == minK) {
                        count++;
                    } else if (nums[j] > maxK) {
                        // Subarray ends here as the maxK condition is no longer satisfied
                        break;
                    }
                }
            }
        }

        return count;
    }
}
