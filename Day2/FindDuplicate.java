package Day2;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public static int findDuplicate(ArrayList<Integer> nums, int n){
        int slow = nums.get(0);
        int fast = nums.get(0);
        do{
            slow = nums.get(slow);
            fast = nums.get(nums.get(fast));
        }while(slow != fast);
        fast = nums.get(0);
        while(slow != fast){
            slow = nums.get(slow);
            fast = nums.get(fast);
        }
        return slow;
    }
}
