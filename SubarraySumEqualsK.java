public class SubarraySumEqualsK {
    static void solve(int[] nums, int idx, int k, int s, int[] count){
        if (idx == nums.length) return;
        for (int j = idx; j < nums.length; j++) {
            s += nums[j];
            if (s == k) count[0]++;
        }
        solve(nums, idx + 1, k, 0, count);
    }
    public static int subarraySum(int[] nums, int k) {
        int count[] = new int[1];
        solve(nums, 0, k, 0, count);
        return count[0];
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
}
