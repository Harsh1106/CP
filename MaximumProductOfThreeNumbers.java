import java.util.Arrays;
public class MaximumProductOfThreeNumbers {
    public static int maxProduct(int[] nums){
        Arrays.sort(nums);
        int f3, l3, f2l1, l2f1, n = nums.length;
        f3 = nums[0]*nums[1]*nums[2];
        l3 = nums[n-1]*nums[n-2]*nums[n-3];
        l2f1 = nums[n-2]*nums[n-1]*nums[0];
        f2l1 = nums[0]*nums[1]*nums[n-1];
        return Math.max(f3, Math.max(l3, Math.max(f2l1, l2f1)));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(maxProduct(arr));
    }
}
