package Day4;

import java.util.ArrayList;
import java.util.HashMap;

public class KadaneAlgo {
    public static void main(String[] args) {

    }
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        int n = arr.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max=0;
        int max1=0;
        for(int i = 0;i<n;i++){
            sum+=arr.get(i);
            if(map.containsKey(sum)){
                max1=i-(map.get(sum));
            }
            else map.put(sum,i);
            if(sum==0) max1=i+1;
            max=Math.max(max,max1);
        }
        return max;

    }
}
