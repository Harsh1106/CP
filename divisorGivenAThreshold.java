import java.util.Arrays;
public class divisorGivenAThreshold{
    public static int sum(int[] nums, int div){
        int sum = 0;
        for(int num : nums){
            sum += Math.ceil((double)num/(double)div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low = 1, high = nums[nums.length - 1];
        while(low <= high){
            int mid = (low + high)/2;
            if(sum(nums, mid) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }     
        return low;
    }
    public static void main(String[] args){
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}