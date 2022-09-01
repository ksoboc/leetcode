package permutations;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            res.add(new ArrayList<>(Arrays.asList(nums[0])));
            return res;
        }

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());


        Deque<Integer> deque = new ArrayDeque<Integer>(list);

        for (var i : nums) {
            var v = deque.poll();
            int[] arr = new int[nums.length - 1];

            var pos = 0;
            for (var j : deque) {
                arr[pos] = j;
                pos++;

            }

            var perms = permute(arr);
            for (var perm : perms) {
                perm.add(v);
            }
            res.addAll(perms);
            deque.offer(v);
        }

        return res;

    }

    List<List<Integer>> res;

    List<List<Integer>> permuteHeap(int[] nums) {
        res = new ArrayList<>();
        permuteHeap(nums.length, nums);
        return res;
    }


    private void permuteHeap(int k, int[] nums) {
        if (k == 1) {
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        } else {
            permuteHeap(k - 1, nums);
            for (var i = 0; i < k - 1; ++i) {
                if (k % 2 == 0) {
                    var tmp = nums[k - 1];
                    nums[k - 1] = nums[i];
                    nums[i] = tmp;
                } else {
                    var tmp = nums[k-1];
                    nums[k-1] = nums[0];
                    nums[0] = tmp;
                }
                permuteHeap(k - 1, nums);
            }
        }
    }

}
