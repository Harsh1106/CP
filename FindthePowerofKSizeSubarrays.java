import java.util.Arrays;
public class FindthePowerofKSizeSubarrays  {
    public static int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        int i = 0, j = 0;
        while(j < n){
            if(j > 0 && nums[j] - nums[j - 1] != 1) i = j;
            while(i < j && j - i + 1 > k) i++;
            if(j - i + 1 == k) ans[j - k + 1] = nums[j];
            j++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,5};
        int k = 3;
        int[] res = resultsArray(arr, k);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}
