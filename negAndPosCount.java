public class negAndPosCount {
    public static int maximumCount(int[] nums) {
        int n = nums.length;
        int negPos = bs(nums, 0, n - 1, 0);
        int negCnt = negPos;
        int posPos = bs(nums, 0, n - 1, 1);
        int posCnt = n - posPos;
        return Math.max(negCnt, posCnt);
    }
    public static int bs(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));
    }
}
