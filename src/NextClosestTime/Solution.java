package NextClosestTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String nextClosestTime(String time) {
        int[] allowedDigits=new int[4];
        Arrays.fill(allowedDigits, 10);
        int[] timeDigits = new int[4];
        int j=0;
        int k=0;
        int flag=0;
        for (int i = 0; i < time.length(); i++) {
            if (i==2)
                continue;
            int digit = time.charAt(i) - '0';
            if ((flag & (1<<digit))==0) {
                allowedDigits[k++] =digit;
                flag|=1<<digit;
            }
            timeDigits[j++]=digit;
        }
        Arrays.sort(allowedDigits);
        int lastIndex= k-1;


        if (timeDigits[3]<allowedDigits[lastIndex]) {
            timeDigits[3] = allowedDigits[indexOf(allowedDigits, timeDigits[3])+1];
            return tabToTime(timeDigits);
        }
        timeDigits[3] = allowedDigits[0];

        if (timeDigits[2] < allowedDigits[lastIndex]) {
            int newDigit = allowedDigits[indexOf(allowedDigits, timeDigits[2])+1];
            if (newDigit <= 5) {
                timeDigits[2] = newDigit;
                return tabToTime(timeDigits);
            }
        }
        timeDigits[2] = allowedDigits[0];

        if ( timeDigits[1] < allowedDigits[lastIndex]) {
            int newDigit = allowedDigits[indexOf(allowedDigits, timeDigits[1])+1];
            if (timeDigits[0] < 2 || newDigit <= 3) {
                timeDigits[1] = newDigit;
                return tabToTime(timeDigits);
            }
        }
        timeDigits[1] = allowedDigits[0];

        if (timeDigits[0] < allowedDigits[lastIndex]) {
            int newDigit = allowedDigits[indexOf(allowedDigits, timeDigits[0]) + 1];
            if ( newDigit <= 2 )
                timeDigits[0] = newDigit;
        }
        timeDigits[0] = allowedDigits[0];

        return tabToTime(timeDigits);

    }

    private String tabToTime(int[] digits) {
        return String.format("%d%d:%d%d", digits[0],digits[1],digits[2],digits[3]);
    }

    private int indexOf(int[] arr, int val) {
        return Arrays.binarySearch(arr,val);
    }

}
