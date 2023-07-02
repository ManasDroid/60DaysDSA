package Day8;

import java.util.ArrayList;

public class maxMeetings {
    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        // Stores count of zero in the array under consideration.
        int cnt0 = 0;
        int l = 0;
        int maxLen = 0;

        // r decides current ending point, i.e. the right pointer.
        for (int r = 0; r < n; r++) {
            if (arr.get(r) == 0) {
                cnt0++;
            }

            // If there are more 0's move left pointer towards current ending point.
            while (cnt0 > k) {
                if (arr.get(l) == 0) {
                    cnt0--;
                }

                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
