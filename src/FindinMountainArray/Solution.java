package FindinMountainArray;

public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peek = 0;
        int n = mountainArr.length();

        int l = 1;
        int r = n - 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int val = mountainArr.get(m);
            int prev = mountainArr.get(m-1);
            int next = mountainArr.get(m+1);

            if (val > prev && next < val)
              {
                  if (val==target)
                      return m;
                peek = m;
                break;
            } else if (prev<val && val<next) {
                l=m+1;
            } else {
                r=m-1;
            }
        }
        int idx = binSearch(mountainArr,0,peek-1,target,true);
        if (idx!=-1)
            return idx;

        return binSearch(mountainArr,peek+1,n-1,target,false);
    }


    private int binSearch(MountainArray mountainArr, int l, int r, int target, boolean ascending) {
        while (l<=r) {
            int m=l+(r-l)/2;
            int val=mountainArr.get(m);
            if (val==target) {
                return m;
            } else if ((ascending && val>target) || (!ascending && val<target)) {
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return -1;
    }
}

interface MountainArray {
    public int get(int index);

    public int length();
}

class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public int getCnt() {
        return cnt;
    }

    private int cnt;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
        cnt = 0;
    }

    @Override
    public int get(int index) {
        ++cnt;
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}