package RangeSumQueryMutable;

public class NumArray {
    private int N;
    private long[] tree;

    public NumArray(int[] nums) {
        N = nums.length + 1;
        tree = new long[N];
        for (int i = 0; i < nums.length; i++) {
            tree[1 + i] = nums[i];
        }
        for (int i = 1; i < N; i++) {
            int parent = i + lsb(i);
            if (parent < N)
                tree[parent] += tree[i];
        }
    }

    private int lsb(int i) {
        return i & (-i);
    }

    public void update(int index, int val) {
        add(index, val - sumRange(index,index));

    }

    private void add(int index, int val) {
        ++index;
        while (index<N) {
            tree[index]+=val;
            index+=lsb(index);
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum(right+1) - prefixSum(left);
    }

    private int prefixSum(int i) {
        int sum=0;
        while (i>0) {
            sum+=tree[i];
            i-=lsb(i);
        }
        return sum;
    }
}
