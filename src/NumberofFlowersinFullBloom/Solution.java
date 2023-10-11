package NumberofFlowersinFullBloom;

import java.util.Arrays;

public class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] startDays = new int[flowers.length];
        int[] endDays = new int[flowers.length];

        int i=0;
        for (var interval:flowers) {
            startDays[i]=interval[0];
            endDays[i]=interval[1];
            ++i;
        }
        Arrays.sort(startDays);
        Arrays.sort(endDays);
        int[] res = new int[people.length];
        i=0;
        for (var day:people) {
            int started = searchStartedIncl(startDays,day);
            int ended = searchEndedBefore(endDays,day);
            res[i++]=started-ended;
        }
        return res;
    }

    private int searchEndedBefore(int[] endDays, int day) {
        int l=0;
        int r=endDays.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (endDays[m]>=day) {
                r=m-1;
            } else if (endDays[m]<day) {
                l=m+1;
            }
        }
        return r;
    }

    private int searchStartedIncl(int[] startDays, int day) {
        int l=0;
        int r=startDays.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (startDays[m]>day) {
                r=m-1;
            } else if (startDays[m]<=day) {
                l=m+1;
            }
        }
        return r;
    }
}
