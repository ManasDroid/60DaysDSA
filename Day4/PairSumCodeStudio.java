package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumCodeStudio {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 5 , 15 , 12 , 9 , 11};
        List<int[]> ans =  pairSum(arr,14);
        for (int i[] : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        // 1 2 3 5 9 11 12 15
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;
        while(i<j){

            if(arr[i]+arr[j]>s)
                j--;
            else if(arr[i]+arr[j]<s)
                i++;
            else if (arr[i] + arr[j] == s) {
                int res[] = new int[2];
                res[0] = arr[i];
                res[1] = arr[j];
                ans.add(res);
                i++;
                j--;
            }


        }
        return ans;
    }
}
