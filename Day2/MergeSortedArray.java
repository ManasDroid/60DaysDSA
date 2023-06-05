package Day2;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

    }
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
        int j=0;
        for(int i=m+n-1; i>m-1; i--){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
