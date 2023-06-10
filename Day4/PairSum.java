package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {

    }
    public static List < int[] > pairSum(int[] arr, int s) {
        int n = arr.length;

        // Used to store result.
        List< int[] > ans = new ArrayList();

        // Checking sum for every element.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = new int[2];
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    ans.add(pair);
                }
            }
        }


        for (int i = 0; i < ans.size(); i++) {
            int a = ans.get(i)[0], b = ans.get(i)[1];
            int res[] = new int[2];
            res[0] = Math.min(a, b);
            res[1] = Math.max(a, b);
            ans.set(i, res);
        }

        Collections.sort(ans, new Comparator< int[] >() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });


        return ans;
    }
}
