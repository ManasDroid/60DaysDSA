package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumCodeStudio {
    public static void main(String[] args) {
        int[] arr = {2 ,-3 ,3 ,3 ,-2};
        List<int[]> ans =  pairSum(arr,0);
        for (int i[] : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        // -6 2 2 2 5
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

                while(arr[i]==arr[i-1]){
                    ans.add(res);
                    i++;
                }
                while(arr[j]==arr[j+1]){
                    if(i>j)break;
                    ans.add(res);
                    j--;
                }
            }



        }
        return ans;
    }
}
