public class minSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0,currentSum=0,minlength=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            currentSum+=nums[right];
            while(currentSum>=target){
                minlength=Math.min(minlength,right-left+1);
                currentSum-=nums[left];
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }
}
