package Day3;

import java.util.ArrayList;

public class SearchIn2DMatrix {
    public static void main(String[] args) {

    }

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {

        int m = mat.size();
        int n = mat.get(0).size();
        int start = 0, end = m * n - 1;

        // Binary search.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mat.get(mid / n).get(mid % n);

            if (target < val) {
                end = mid - 1;
            } else if (target > val) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
