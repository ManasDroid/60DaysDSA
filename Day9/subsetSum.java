package Day9;

import java.util.ArrayList;
import java.util.Collections;

public class subsetSum {

    public static ArrayList<Integer> subsetSum(int num[]) {

        int n = num.length;
        // Ans array contains all the subset sums.
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                // Checking wheather the element is present the subset or not.
                if (((1 << j) & i) != 0) {
                    sum += num[j];
                }
            }
            ans.add(sum);
        }
        // Sort the vector and finally return it.
        Collections.sort(ans);
        return ans;
    }
}
