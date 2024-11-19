import java.util.HashSet;

public class MaximumSumofDistinctSubarraysWithLengthK{
    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int start = 0, end = 0;
        long max =  0, sum = 0;
        while(end < nums.length){
            int temp = nums[end];
            while(set.contains(temp)){
                set.remove(nums[start]);
                max = max - nums[start];
                start++;
            }
            max = max + temp;
            if((end - start + 1) == k){
                sum = Math.max(sum, max);
                max = max - nums[start];
                set.remove(nums[start]);
                start++;
            }
            set.add(temp);
            end++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));
    }
}