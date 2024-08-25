public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLen = 0, zero = 0, n = nums.length;
        while(r < n){
            if(nums[r] == 0)
                zero++;
            if(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            if(zero <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
}
