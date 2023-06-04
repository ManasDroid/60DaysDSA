package Day1;

public class Sort012 {
    public static void main(String[] args) {

    }
    public static void sort012(int[] nums)
    {
        int len = nums.length;
        int low = 0, mid = 0, high = len - 1;
        while(mid <= high){
            switch(nums[mid]){

                case 0 :{
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }

            }
        }
    }
}
