package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(nums == null || nums.length == 0)
            return res;

        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                int target2 = target -(nums[i]+nums[j]);
                int low = j+1;
                int high = n-1;

                while(low < high){
                    int twoSum = nums[low] + nums[high];
                    if(twoSum < target2) low++;
                    else if(twoSum > target2) high--;

                    else{
                        List<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[low]);
                        quad.add(nums[high]);
                        res.add(quad);

                        while(low < high && nums[low] == quad.get(2)) ++low;
                        while(low < high && nums[high] == quad.get(3)) --high;
                    }
                }

                while(j+1 < n && nums[j+1]==nums[j]) ++j;
            }
            while(i+1 < n && nums[i+1]==nums[i]) ++i;
        }

        return res;
    }
}
