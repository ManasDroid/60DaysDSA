package Day4;

import java.util.Arrays;

public class FourSumCodestudio {
    public static void main(String[] args) {

    }

        public static String fourSum(int[] arr, int target, int n) {

            int size = n * (n - 1) / 2;
            Pair[] temp = new Pair[size];
            int k = 0;
            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    temp[k] = new Pair(arr[i] + arr[j], i, j);
                    ++k;
                }
            }
            // Sort the temp[] array on the basis of sum.
            Arrays.sort(temp);

            int left = 0;
            int right = size - 1;

        /*
            As array is sorted we will apply two pointer technique
            to find pair of elements in temp[] array having
            their sum equal to target sum.
        */

            while (left < size && right >= 0) {
                int sum = temp[left].sum + temp[right].sum;
                if (sum == target && !commonIdx(temp[left], temp[right])) {
                    return "Yes";
                } else if (sum < target) {
                    ++left;
                } else {
                    --right;
                }
            }
            // If we can not found the target sum then we return No.
            return "No";

        }

        // This function will true if Pair p1 and p2 has at least one common index.
        private static boolean commonIdx(Pair p1, Pair p2) {
            return p1.idx1 == p2.idx1 || p1.idx1 == p2.idx2 || p1.idx2 == p2.idx1 || p1.idx2 == p2.idx2;
        }

        // Custom Pair class to store sum and indexes.
        static class Pair implements Comparable < Pair > {
            int sum;
            int idx1;
            int idx2;
            Pair(int sum, int idx1, int idx2) {
                this.sum = sum;
                this.idx1 = idx1;
                this.idx2 = idx2;
            }

            @Override
            public int compareTo(Pair o) {
                return this.sum - o.sum;
            }
        }
    }

