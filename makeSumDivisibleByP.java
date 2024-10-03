import java.util.HashMap;
public class makeSumDivisibleByP {
    public static int minSubarray(int[] nums, int p) {
        long totalSum = 0;
         for (int num : nums) {
             totalSum += num;
         }
 
         int remainder = (int)(totalSum % p);
         if (remainder == 0) return 0;
 
         HashMap<Integer, Integer> prefixSums = new HashMap<>();
         prefixSums.put(0, -1);
 
         int n = nums.length;
         int prefixSum = 0;
         int minLength = n;
 
         for (int i = 0; i < n; i++) {
             prefixSum = (prefixSum + nums[i]) % p;
             if (prefixSum < 0) {
                 prefixSum += p;  // Adjust for negative remainders
             }
 
             int target = (prefixSum - remainder + p) % p;
             if (prefixSums.containsKey(target)) {
                 minLength = Math.min(minLength, i - prefixSums.get(target));
             }
             prefixSums.put(prefixSum, i);
         }
         return minLength == n ? -1 : minLength;
    }
    public static void main(String[] args){
        int[] nums = {3,1,3,4,3};
        int p = 5;
        System.out.print(minSubarray(nums, p));
    }
}
