import java.util.Arrays;
public class CountTheNumberOfFairyPairs {    
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
    private static long count(int[] nums, int target){
        long count = 0;
        int left = 0, right = nums.length - 1;
        while(left < right){
            if(nums[right] + nums[left] > target) right--;
            else{
                count += right - left;
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3, upper = 6;
        System.out.println(countFairPairs(nums, lower, upper));
    }
}

