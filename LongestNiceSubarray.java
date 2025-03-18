public class LongestNiceSubarray {
    public static int longestNiceSubarray(int[] nums) {
        int maxLen = 0, start = 0, bitMask = 0;
        for(int end = 0 ; end < nums.length ; end++){
            // shrinking
            while((bitMask & nums[end]) != 0){
                bitMask = bitMask ^ nums[start];
                start++;
            }
            bitMask = bitMask | nums[end];
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,8,48,10};
        System.out.println(longestNiceSubarray(nums));
    }
}
