public class maxPairSumInArray{
    private static int findMax(int num){
        int largest = 0;
        while(num > 0){
            int temp = num % 10;
            largest = Math.max(largest, temp);
            num /= 10;
        }
        return largest;
    }
    public static int maxSum(int[] nums) {
        int[] arr = new int[10];
        int ans = -1;
        for(int num : nums){
            int i = findMax(num);
            if(arr[i] != 0){
                ans = Math.max(ans, arr[i] + num);
            }
            arr[i] = Math.max(arr[i], num);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {2536,1613,3366,162};
        System.out.println(maxSum(nums));
    }
}